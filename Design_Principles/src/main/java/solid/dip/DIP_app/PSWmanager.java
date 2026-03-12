package solid.dip.DIP_app;

import solid.dip.DIP_viol.*;
import java.util.Scanner;

public class PSWmanager {

	public static void main(String[] args) {
		
		String usr=null;
		String psw = null;
		
		PSWGeneratorService gs = new PSWGeneratorService();
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter your username: ");
	     usr = scanner.nextLine();  
		
	     psw = gs.getRandomPSW();
	     
	     System.out.println("The password is : " + psw);
	}

}
