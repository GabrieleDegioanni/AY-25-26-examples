package solid.ocp.OCP_app;

import solid.ocp.OCP_ref.*;

public class StringCalculatorApp_ref {

	public static void main(String[] args) {
		
		StringAdditionRef sa = new StringAdditionRef("Archit", "ecture");
		StringLengthComparisonRef slc = new StringLengthComparisonRef("Design", "Architecture");
		
		//added later
		StringInversionRef si = new StringInversionRef("Software");
		
		StringCalculatorRef sc = new StringCalculatorRef();
		try {
			
			sc.calculate(sa);
			System.out.println(sa.getResult());
			
			sc.calculate(slc);
			System.out.println(slc.getResult());
			
			//added later
			sc.calculate(si);
			System.out.println(si.getResult());
				
		} catch (Exception e) {
			System.err.println("Operation not recognized");
			e.printStackTrace();
		}

	}

}
