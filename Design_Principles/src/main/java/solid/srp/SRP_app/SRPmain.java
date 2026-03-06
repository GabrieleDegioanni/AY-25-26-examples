package solid.srp.SRP_app;

import solid.srp.SRP_viol.Course;
import solid.srp.SRP_viol.Student;

public class SRPmain {


	Student s;
	
	public static void main(String[] args) {
		
		
		//Students office: insert students
		Student s1 = new Student(234567, "Fog" ,"Frank");
		Student s2 = new Student(234234, "Sun" ,"Steven");
		
		//Teaching dept.: insert courses
		Course c1 = new Course("01HTK29","Web Development", 6);
		Course c2 = new Course("01APL83","Software Engineering", 6);
		Course c3 = new Course("02KAM43","Compilers",6);
		
		//Professors: insert marks
		s1.insertGrade(c1.getCode(), 28);
		s1.insertGrade(c2.getCode(), 26);
		s1.insertGrade(c3.getCode(), 24);
				
		s2.insertGrade(c1.getCode(), 20);
		s2.insertGrade(c2.getCode(), 22);
		
		double threholdsGpa = 22;
		
		//Students office verifies admission criterion
		System.out.println(s1.print() + " admission check: " +  s1.verifyAdmissionCriteria(threholdsGpa));
		System.out.println(s2.print() + " admission check: " +  s2.verifyAdmissionCriteria(threholdsGpa) + "\n");

	
		// a change to computeAverage occurs (made by finance dept.)
	
		
		//Finance dept. set taxes
		s1.calculateTax(1000.00, threholdsGpa, 0.25);
		System.out.println(s1.print() + " avg: " + s1.getGpa() + "   - : "+ s1.getTaxesDue());
		
		s2.calculateTax(1000.00, threholdsGpa, 0.25); // threholdsGpa -1 to simulate change to computeAverage
		System.out.println(s2.print() + " avg: " + s2.getGpa() + "   - : "+ s2.getTaxesDue() + "\n");
		
		System.out.println("Grade point average "  + s1.print()  + s1.getGpa());
		System.out.println("Grade point average "  + s2.print()  + s2.getGpa() + "\n");

		
		
	}
	

} 
