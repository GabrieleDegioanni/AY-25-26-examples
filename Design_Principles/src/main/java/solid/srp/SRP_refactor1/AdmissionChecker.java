package solid.srp.SRP_refactor1;

import java.util.Collection;
import java.util.Map;

public class AdmissionChecker {

	
	public static boolean VerifyAdmissionCriteria(StudentData sd, double threshold) {
		
		//get all subject and grades
		Map<String,Integer> sg = sd.getSubjectsGrades();
		
	
		//get all grades and compute the average
		Collection<Integer> grades = sg.values();
		int sum = 0;
		for(int g : grades ) {
			sum+=g;
		}
		double avg = sum/grades.size();
		
		System.out.println(sd.print()+ " avg for admission to special program " + avg);
		
		//compute taxes
		if(grades.size() >= 2 && avg >= threshold ) 
			sd.setAdmissionStatus(true);
		
		return sd.getAdmissionStatus() ;
		
		
	}

}
