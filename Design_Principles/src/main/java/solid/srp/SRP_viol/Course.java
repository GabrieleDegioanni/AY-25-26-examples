package solid.srp.SRP_viol;

public class Course {

	private String name; 
	private String code;
	private int credits; 
	
	
	public Course(String name , String code, int credits ) {
		
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
