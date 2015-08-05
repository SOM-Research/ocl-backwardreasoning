package cat.icrea.ocl.backwardreasoning.example.productionsystem;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ProductionSystem.Conveyor;
import ProductionSystem.Processed;
import ProductionSystem.ProductionSystemFactory;
import ProductionSystem.ProductionSystemPackage;
import ProductionSystem.Raw;
import cat.icrea.ocl.backwardreasoning.facade.OCLBackWardReasoning;
import cat.icrea.ocl.backwardreasoning.utils.OCLUtil;

import org.eclipse.ocl.ecore.Constraint;

public class UsingBackwardReasoning {
	public static String XMI_FILE = "model/Machine.xmi";

	public static void main(String[] args) throws Exception {

		run();

	}

	private static Resource loadModel() {
		Resource resource;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put("http://emf-rest.com/PS",
				ProductionSystemPackage.eINSTANCE);
		ResourceSet rst = new ResourceSetImpl();
		resource = rst.getResource(URI.createURI(XMI_FILE), true);
		return resource;
	}

	private static void run() throws Exception {
		// Load the bank model
		Resource resource = loadModel();
		// Load the OCL constraints
		Constraint constraint = OCLUtil.parseOCL(
				URI.createFileURI("model/productionSystem.ocl"), ProductionSystemPackage.eINSTANCE).get(0);
		// Test classes
		Conveyor co1 = (Conveyor) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@ic.0");
		Raw raw1 = (Raw) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@ic.0/@piece.0");
		ProductionSystemFactory factory = ProductionSystemFactory.eINSTANCE;
		Processed processed = factory.createProcessed();
		long start = System.currentTimeMillis();
		System.out.println("Constraint");
		System.out.println(constraint);
		System.err
				.println("Delete the object r");
		
		OCLBackWardReasoning oclBackWardReasoning = new OCLBackWardReasoning();
		
			System.out.println("Post-condition : " + constraint);
			Constraint temp = oclBackWardReasoning.deleteObjet(constraint,
					raw1.eClass(), "r");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.err
			.println("creating a link between co1 and p");
			temp = oclBackWardReasoning.createLink(temp, co1.eClass(), processed.eClass(), "co1", "p");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
		
			System.err
			.println("creating object p");
			temp = oclBackWardReasoning.createObject(temp, processed.eClass(), "p");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
		
		
		long stop = System.currentTimeMillis();
		System.out
		.println("Total time : "+ (stop - start)/1000.0+"s");
	
	}

}
