package solid.srp.SRP_refactor2;

public class GradeInserter2 {
	
	//now visibility turned to protected
	protected static void insertGrade(StudentData2 sd, CourseRef2 c, int grade) {
		
		sd.insertGrade(c.getCode(),grade);
	}

}
