package solid.ocp.OCP_app;

import solid.ocp.OCP_viol.*;

public class StringCalculatorApp_viol {

	public static void main(String[] args) {
		
		StringAddition sa = new StringAddition("Archit", "ecture");
		StringLengthComparison slc = new StringLengthComparison("Design", "Architecture");
		
		//added later
		//StringInversion si = new StringInversion("Software");
		
		StringCalculator sc = new StringCalculator();
		try {
			
			sc.calculate(sa);
			System.out.println(sa.getResult());
			
			sc.calculate(slc);
			System.out.println(slc.getResult());
			
			//added later
			//sc.calculate(si);
			//System.out.println(si.getResult());
			
		} catch (Exception e) {
			System.err.println("Operation not recognized");
			e.printStackTrace();
		}

	}

}
