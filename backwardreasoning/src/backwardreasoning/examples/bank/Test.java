package backwardreasoning.examples.bank;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.ecore.Constraint;

import backwardreasoning.examples.utils.OCLUtil;
import bank.BankPackage;

public class Test {

	public static void main(String[] args) throws Exception {
		List<Constraint> constraints = OCLUtil
				.parseOCL(
						URI.createFileURI("./src/backwardreasoning/examples/bank/bank.ocl"),
						BankPackage.eINSTANCE);
		System.out.println(constraints);

	}

}
