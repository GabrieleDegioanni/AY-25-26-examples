package solid.srp.SRP_viol;

import java.util.*;

public class Student {

	private double taxDue;
	private Map<String, Integer> grades; //name, credit, mark
	private int id;
	private String surname;
	private String name;
	private double gpa; //grade point average 
	private boolean specialProgram;
	
	public Student(int id, String surname, String name) {
		
		this.grades = new HashMap<String,Integer>();
		this.taxDue = 0;
		this.gpa= 0;
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.specialProgram = false;
		
	}
		
	//used by Finance Dept.
	public void calculateTax(double t, double t_pga, double discountRate ) {
		if(computeAverage()>=t_pga)
			this.taxDue = t - (t*discountRate);
		else this.taxDue = t;
	}
	


	//used by Professors
	public void insertGrade(String code, int grade) {
		
		this.grades.put(code, Integer.valueOf(grade));
		
		this.gpa = computeAverage(); 
		
	}
	
	//used by Students Office
	public boolean verifyAdmissionCriteria(double threshold) {
		
		if(grades.size() >= 2 && computeAverage() >= threshold ) 
			this.specialProgram = true;
		
		return this.specialProgram;
	}

	//public utility
	public double getGpa() {
	
		return this.gpa;
	}
	
	//public utility
		public String print() {
			return this.surname + " " + this.name + " ";
		}
	
	//public utility
	public void setGpa(double newGpa) {
	
		 this.gpa = newGpa;
	}	

	//private utility
	private double computeAverage() {
		
		int sum = 0;

		for (String key : grades.keySet()) {
			sum += grades.get(key);
		}
		
		return (double) sum/grades.size();
		
		
	}

	//public utility
	public double getTaxesDue() {
		
		return this.taxDue;
	}
	
	
	
}
