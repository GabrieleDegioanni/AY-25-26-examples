package solid.srp.SRP_refactor2;

public class StudentFacade {

	public void insertGrade(StudentData2 s, CourseRef2 c, int i) {
		GradeInserter2.insertGrade(s, c, i);
	}

	public boolean VerifyAdmissionCriteria(StudentData2 s, double d) {
		return AdmissionChecker2.VerifyAdmissionCriteria(s, d);
	}

	public void calculateTax(StudentData2 s, double threholdGpa, double discount) {
		TaxCalculator2.calculateTax(s, threholdGpa, discount);
	}

	


	
}
