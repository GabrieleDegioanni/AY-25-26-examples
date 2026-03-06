package solid.srp.SRP_app;

import solid.srp.SRP_refactor2.AdmissionChecker2;
import solid.srp.SRP_refactor2.CourseRef2;
import solid.srp.SRP_refactor2.GradeInserter2;
import solid.srp.SRP_refactor2.StudentData2;
import solid.srp.SRP_refactor2.TaxCalculator2;

import solid.srp.SRP_refactor2.StudentFacade;


public class SRP_main_ref2 {

	public static void main(String[] args) {
		
		StudentFacade sf = new StudentFacade();
		
		//Students office: insert students. For sake of semplicity: direct access to StudentData
				StudentData2 s1 = new StudentData2(234567, "Fog" ,"Frank");
				StudentData2 s2 = new StudentData2(234234, "Sun" ,"Steven");
				
		//Teaching dept.: insert courses. For sake of semplicity: direct access to Course
				CourseRef2 c1 = new CourseRef2("01HTK29","Web Development", 6);
				CourseRef2 c2 = new CourseRef2("01APL83","Software Engineering", 6);
				CourseRef2 c3 = new CourseRef2("02KAM43","Compilers",6);
				
				
		//Professors: insert marks
				sf.insertGrade(s1, c1, 28);
				sf.insertGrade(s1, c2, 26);
				sf.insertGrade(s1, c3, 24);
				
				sf.insertGrade(s2, c1, 20);
				sf.insertGrade(s2, c2, 22);
			
			
		//Students office verifies admission criterion to special program
				double thresholdGpa = 22.0;
				System.out.println(s1.print() + " admitted to special program: " + sf.VerifyAdmissionCriteria(s1,thresholdGpa)); 
				System.out.println(s2.print() + " admitted to special program: " + sf.VerifyAdmissionCriteria(s2,thresholdGpa)+ "\n"); 

		//Finance department: compute taxes		
				
				double discount = 0.25;
				
				sf.calculateTax(s1, thresholdGpa, discount);
				System.out.println(s1.print() + " taxes due: " + s1.getTaxesDue());
				
				sf.calculateTax(s2, thresholdGpa, discount);
				System.out.println(s2.print() + " taxes due: " +  s2.getTaxesDue());
			


	}

}
