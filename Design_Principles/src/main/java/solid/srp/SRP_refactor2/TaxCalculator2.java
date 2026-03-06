package solid.srp.SRP_refactor2;

import java.util.Collection;
import java.util.Map;

public class TaxCalculator2 {

	private static double due = 1000;
	
	//now visibility turned to protected
	protected static void calculateTax(StudentData2 sd, double t_pga, double discountRate ) {
		
		//get all subject and grades
		Map<String,Integer> sg = sd.getSubjectsGrades();
		
		//find the worst mark and remove it
		String lowest = null;
		int min = 30;
		int grade= 0;
		
		for (String key : sg.keySet()) {
			grade = sg.get(key);
			if (grade < min) {
				min = grade;
				lowest= key;
			}	
		}
		
		System.out.println(sd.print()+ " removed lowest " + lowest + " " + sg.get(lowest));
		sg.remove(lowest);
	
		//get all grades and compute the average
		Collection<Integer> grades = sg.values();
		int sum = 0;
		for(int g : grades ) {
			sum+=g;
		}
		double avg = sum/grades.size();
		
		System.out.println(sd.print()+ " avg " + avg);
		//compute taxes

		double topay = due; 
		if(avg>t_pga)
			
			topay = topay - (topay*discountRate);	
			 
		
			
		sd.setTaxesDue(topay);	
		
	}
	
}
