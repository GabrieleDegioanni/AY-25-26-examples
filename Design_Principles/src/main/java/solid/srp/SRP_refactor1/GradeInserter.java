package solid.srp.SRP_refactor1;

public class GradeInserter {
	

	public static void insertGrade(StudentData sd, CourseRef1 c, int grade) {
		
		sd.insertGrade(c.getCode(),grade);
	}

}
