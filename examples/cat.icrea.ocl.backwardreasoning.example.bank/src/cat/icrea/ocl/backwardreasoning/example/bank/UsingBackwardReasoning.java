package cat.icrea.ocl.backwardreasoning.example.bank;

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

import bank.Account;
import bank.BankPackage;
import bank.Client;
import bank.Manager;
import cat.icrea.ocl.backwardreasoning.facade.OCLBackWardReasoning;
import cat.icrea.ocl.backwardreasoning.utils.OCLUtil;

import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.ecore.Constraint;

public class UsingBackwardReasoning {
	public static String XMI_FILE = "model/bank.xmi";

	public static void main(String[] args) throws Exception {

		run();

	}

	private static Resource loadModel() {
		Resource resource;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put("http://emf-rest.com/bank",
				BankPackage.eINSTANCE);
		ResourceSet rst = new ResourceSetImpl();
		resource = rst.getResource(URI.createURI(XMI_FILE), true);
		return resource;
	}

	private static void run() throws Exception {
		// Load the bank model
		Resource resource = loadModel();
		// Load the OCL constraints
		List<Constraint> constraints = OCLUtil.parseOCL(
				URI.createFileURI("model/bank.ocl"), BankPackage.eINSTANCE);
		// Test classes
		Account account = (Account) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@accounts.1");
		Client client = (Client) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@clients.0");
		Manager manager = (Manager) EcoreUtil.getEObject(resource.getContents()
				.get(0), "@managers.0");
		EAttribute capacity = account.eClass().getEAllAttributes().get(0);
		long start = System.currentTimeMillis();
		System.out.println("List of constraints");
		System.out.println(constraints);
		System.err
				.println("Delete the object of type Account which has the reference a");
		OCLBackWardReasoning oclBackWardReasoning = new OCLBackWardReasoning();
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.deleteObjet(c,
					account.eClass(), "a");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
		}
		System.err
		.println("Delete the link between client c and manager m");
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.deleteLink(c, client.eClass(), manager.eClass(),"c", "m");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
			
		}
		System.err
		.println("Create a link between client c and account a");
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.createLink(c, client.eClass(), account.eClass(),"c", "a");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
			
		}
		System.err
		.println("Update the attribute credit of the account a : put new_val expression");
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.updateAttribute(c, account.eClass(), "a", capacity, "new_val");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
			
		}
		System.err
		.println("Create object :  Account a");
		for (Constraint c : constraints) {
			System.out.println("Post-condition : " + c);
			Constraint temp = oclBackWardReasoning.createObject(c, account.eClass(), "a");
			System.out.println("Pre-condition : "
					+ temp.getSpecification().getBodyExpression());
			System.out.println("");
			
			
		}
		long stop = System.currentTimeMillis();
		System.out
		.println("Total time : "+ (stop - start)/1000.0+"s");
	}

}
