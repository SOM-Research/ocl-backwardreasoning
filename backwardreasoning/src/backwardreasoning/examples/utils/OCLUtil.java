package backwardreasoning.examples.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;

import backwardreasoning.examples.visitors.LookupSelfVariableVisitor;

public class OCLUtil {

	public static List<Constraint> parseOCL(URI oclFileURI, EPackage pack)
			throws Exception {
		OCLParser oclParser = new OCLParser(pack);
		String cleanOCLQuery = removeImports(oclFileURI);
		List<Constraint> constraint = oclParser.parseTextualOCL(cleanOCLQuery);
		return constraint;
	}

	private static String removeImports(URI oclFileURI) throws Exception {
		StringBuffer oclQuery = new StringBuffer();
		BufferedReader br = new BufferedReader(new FileReader(
				oclFileURI.toFileString()));
		String line;
		while ((line = br.readLine()) != null) {
			if (!line.contains("import")) {
				oclQuery.append(line);
				oclQuery.append("\n");
			}
		}
		br.close();
		return oclQuery.toString();
	}

	public static void insertQuantificationForSelf(
			OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper,
			EClass contextCls, ExpressionInOCL oclExpression)
			throws ParserException {

		OCLExpression bodyExp = oclExpression.getBodyExpression();
		LookupSelfVariableVisitor lookupVisitor = new LookupSelfVariableVisitor();
		bodyExp.accept(lookupVisitor);
		Variable<EClassifier, EParameter> selfDecl = lookupVisitor.getResult();
		if (selfDecl != null) {
			System.err.println("Adding required self variable quantification");
			EcorePackage oclPackage = (EcorePackage) oclExpression.eClass()
					.getEPackage();
			EcoreFactory oclFactory = (EcoreFactory) oclPackage
					.getEFactoryInstance();
			IteratorExp forAllExp = oclFactory.createIteratorExp();
			forAllExp.setName("forAll");
			forAllExp.setType((EClassifier) bodyExp.getType());
			selfDecl.setName("self");
			selfDecl.setType(contextCls);
			forAllExp.getIterator().add(selfDecl);
			forAllExp.setBody(bodyExp);
			helper.setContext(contextCls);
			OCLExpression<EClassifier> allInstancesExp = helper
					.createQuery(contextCls.getName() + ".allInstances()");
			forAllExp.setSource(allInstancesExp);
			oclExpression.setBodyExpression(forAllExp);
		}
	}

}
