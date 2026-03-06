package solid.srp.SRP_refactor1;

public class CourseRef1 {

	private String name; 
	private String code;
	private int credits; 
	
	
	public CourseRef1(String name , String code, int credits ) {
		
		this.code = name;
		this.name = code;
		this.credits = credits;
	}


	public String getName() {
		return name;
	}


	public String getCode() {
		return code;
	}


}
