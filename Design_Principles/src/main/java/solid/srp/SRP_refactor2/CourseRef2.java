package solid.srp.SRP_refactor2;

public class CourseRef2 {

	private String name; 
	private String code;
	private int credits; 
	
	
	public CourseRef2(String name , String code, int credits ) {
		
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
