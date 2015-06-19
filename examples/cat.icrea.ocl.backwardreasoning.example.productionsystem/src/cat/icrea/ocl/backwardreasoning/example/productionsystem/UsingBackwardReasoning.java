package cat.icrea.ocl.backwardreasoning.example.productionsystem;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ProductionSystem.Conveyor;
import ProductionSystem.ProductionSystemPackage;
import cat.icrea.ocl.backwardreasoning.facade.OCLBackWardReasoning;
import cat.icrea.ocl.backwardreasoning.utils.OCLUtil;

import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.ecore.Constraint;

public class UsingBackwardReasoning {
	public static String XMI_FILE = "model/machine.xmi";

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
		List<Constraint> constraints = OCLUtil.parseOCL(
				URI.createFileURI("model/machine.ocl"), ProductionSystemPackage.eINSTANCE);
		// Test classes
		Conveyor co1 = (Conveyor) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@ic.0");
	
		System.out.println("List of constraints");
		System.out.println(constraints);
		System.err
				.println("Delete the object r");
		OCLBackWardReasoning oclBackWardReasoning = new OCLBackWardReasoning();
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.deleteObjet(c,
					co1.eClass(), "r");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
		}
		
		
		
	
	}

}
