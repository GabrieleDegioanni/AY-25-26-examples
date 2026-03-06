package solid.srp.SRP_app;

import solid.srp.SRP_refactor1.AdmissionChecker;
import solid.srp.SRP_refactor1.CourseRef1;
import solid.srp.SRP_refactor1.GradeInserter;
import solid.srp.SRP_refactor1.StudentData;
import solid.srp.SRP_refactor1.TaxCalculator;


public class SRP_main_ref1 {

	public static void main(String[] args) {
		
		//Students office: insert students. For sake of semplicity: direct access to StudentData
				StudentData s1 = new StudentData(234567, "Fog" ,"Frank");
				StudentData s2 = new StudentData(234234, "Sun" ,"Steven");
				
		//Teaching dept.: insert courses. For sake of semplicity: direct access to Course
				CourseRef1 c1 = new CourseRef1("01HTK29","Web Development", 6);
				CourseRef1 c2 = new CourseRef1("01APL83","Software Engineering", 6);
				CourseRef1 c3 = new CourseRef1("02KAM43","Compilers",6);
				
				
		//Professors: insert marks
				GradeInserter.insertGrade(s1, c1, 28);
				GradeInserter.insertGrade(s1, c2, 26);
				GradeInserter.insertGrade(s1, c3, 24);
				
				GradeInserter.insertGrade(s2, c1, 20);
				GradeInserter.insertGrade(s2, c2, 22);
			
			
		//Students office verifies admission criterion to special program
				double thresholdGpa = 22.0;
				System.out.println(s1.print() + " admitted to special program: " + AdmissionChecker.VerifyAdmissionCriteria(s1,thresholdGpa)); 
				System.out.println(s2.print() + " admitted to special program: " + AdmissionChecker.VerifyAdmissionCriteria(s2,thresholdGpa) + "\n"); 

		//Finance department: compute taxes		
				
				double discount = 0.25;
				
				TaxCalculator.calculateTax(s1, thresholdGpa, discount);
				System.out.println(s1.print() + " taxes due: " + s1.getTaxesDue());
				
				TaxCalculator.calculateTax(s2, thresholdGpa, discount);
				System.out.println(s2.print() + " taxes due: " +  s2.getTaxesDue()+ "\n");
			
	}

}
