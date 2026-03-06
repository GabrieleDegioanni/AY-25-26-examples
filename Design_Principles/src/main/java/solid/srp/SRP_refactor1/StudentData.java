package solid.srp.SRP_refactor1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentData {

	private double taxDue;
	private Map<String, Integer> grades; //name, credit, mark
	private int id;
	private String surname;
	private String name;
	private double gpa; //grade point average 
	boolean specialProgramAdmission;
	
	public StudentData(int id, String surname, String name) {
		
		this.grades = new HashMap<String,Integer>();
		this.taxDue = 0;
		this.gpa= 0;
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.specialProgramAdmission = false;
		
	}
		

	//used by GradeInserter
	protected void insertGrade(String code, int grade) {
		
		this.grades.put(code, Integer.valueOf(grade));
		
		
	}
	
	//p utility
	protected double getGpa() {
	
		return this.gpa;
	}
	
	//public utility
		public String print() {
			return this.surname + " " + this.name + " ";
		}
	

	//public utility
	public double getTaxesDue() {
		
		return this.taxDue;
	}
	
	//utility
	protected void setTaxesDue(double d) {
		this.taxDue = d;
	}
	
	//utility
	protected Collection<Integer> getGrades() {
		return grades.values();
	}
	
	//utility
	protected Map<String, Integer> getSubjectsGrades(){
		return grades;
	}

	//utility
	protected void setAdmissionStatus(boolean b) {
		this.specialProgramAdmission = b;
		
	}

	//utility
	protected boolean getAdmissionStatus() {
		
		return this.specialProgramAdmission;
	}
	
}
