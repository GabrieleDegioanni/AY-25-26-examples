package solid.dip.DIP_app;

import solid.dip.DIP_ref.*;
import solid.dip.DIP_ref.generators.PSWGeneratorRef;
import solid.dip.DIP_ref.generators.SpecialPSWGenerator;

import java.util.Scanner;

public class PSWmanagerRef {

	public static void main(String[] args) {
		
		String usr=null;
		String psw = null;
		String psw2 = null;
		

		
		 I_PSWGeneratorServiceRef gs = new PSWGeneratorRef();
	   //  I_PSWGeneratorServiceRef sgs = new SpecialPSWGenerator();
	     
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter your username: ");
	     usr = scanner.nextLine();  
		
	     
	     psw = gs.getRandomPSW();
	    // psw2 = sgs.getRandomPSW();
	     
	     System.out.println("The password is : " + psw);
	    // System.out.println("The password is : " + psw2);
	     
	}

}
