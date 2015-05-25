/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package backwardreasoning.examples.bank;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.PrimitiveType;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.OCLFactory;

import backwardreasoning.examples.utils.OCLUtil;
import backwardreasoning.examples.visitors.LookupAssociationVisitor;
import backwardreasoning.examples.visitors.LookupPropertyVisitor;
import backwardreasoning.examples.visitors.LookupSelfVariableVisitor;
import backwardreasoning.examples.visitors.LookupVariableVisitor;
import bank.Account;
import bank.BankPackage;

/**
 * Bank example for the Henshin interpreter. Shows the usage of the interpreter.
 * 
 * @author Christian Krause
 */
public class BankExample {

	/**
	 * Relative path to the bank model files.
	 */
	public static final String PATH = "src/backwardreasoning/examples/bank";

	public static enum ACTION {
		DELETE_OBJECT, CREATE_OBJECT, UPDATE_ATTRIBUTE, DELETE_LINK, CREATE_LINK
	};

	/**
	 * Run the bank example.
	 * 
	 * @param path
	 *            Relative path to the model files.
	 * @param saveResult
	 *            Whether the result should be saved.
	 * @throws Exception
	 */
	public static void run(String path, boolean saveResult) throws Exception {

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Load the module:
		Module module = resourceSet.getModule("bank.henshin", false);

		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource("bank.xmi"));

		//OCL constraints
		List<Constraint> constraints = OCLUtil
				.parseOCL(
						URI.createFileURI("./src/backwardreasoning/examples/bank/bank.ocl"),
						BankPackage.eINSTANCE);
		
		//Test classes
		EClass accountEClass = EcoreUtil.getEObject(graph.getRoots()
				.get(0), "@accounts.1").eClass();
		EClass clientEClass =  EcoreUtil.getEObject(graph.getRoots()
				.get(0), "@clients.0").eClass();
		EClass managerEClass =  EcoreUtil.getEObject(graph.getRoots()
				.get(0), "@managers.0").eClass();
		Engine engine = new EngineImpl();
		UnitApplication app = new UnitApplicationImpl(engine);
		app.setEGraph(graph);
		
//		app.setUnit(module.getUnit("deleteAccount"));
//		app.setParameterValue("a", account);
//
//		if (!app.execute(null)) {
//			throw new RuntimeException("Error deleting object");
//		}
//
//		// Saving the result:
//		if (saveResult) {
//			resourceSet.saveEObject(graph.getRoots().get(0),
//					"example-result.xmi");
//		}
		System.out.println("List of constraints");
		System.out.println(constraints);
		System.err.println("Delete the object of type Account which has the reference a");
		for (Constraint c : constraints) {
			System.out.println("Post-condition : "+c);
			DeleteObjectPattern deleteObject = new DeleteObjectPattern(c,
					accountEClass, "a");
			deleteObject.insertQuantification();
			System.out.println("Pre-condition : "+deleteObject.getOclExpression().getBodyExpression());
			System.out.println("");
		}
		constraints = OCLUtil
				.parseOCL(
						URI.createFileURI("./src/backwardreasoning/examples/bank/bank.ocl"),
						BankPackage.eINSTANCE);
		
			System.err.println("Delete the link between client c and manager m");
			for (Constraint c : constraints) {
				System.out.println("Post-condition : "+c);
			DeleteLinkPattern deleteLink = new DeleteLinkPattern(c, clientEClass, managerEClass, "c", "m");
			deleteLink.insertQuantification();
			System.out.println("Pre-condition : "+deleteLink.getOclExpression().getBodyExpression());
			System.out.println("");
			}
			System.err.println("Create a link between client c and account a");
			constraints = OCLUtil
					.parseOCL(
							URI.createFileURI("./src/backwardreasoning/examples/bank/bank.ocl"),
							BankPackage.eINSTANCE);
			for (Constraint c : constraints) {
				System.out.println("Post-condition : "+c);
			CreateLinkPattern createLink = new CreateLinkPattern(c, clientEClass, accountEClass, "c", "a");
			createLink.insertQuantification();
			System.out.println("Pre-condition : "+createLink.getOclExpression().getBodyExpression());	
			System.out.println("");

		}

	}

	public static void main(String[] args) throws Exception {
		run(PATH, true); // we assume the working directory is the root of the
							// examples plug-in
	}

}
