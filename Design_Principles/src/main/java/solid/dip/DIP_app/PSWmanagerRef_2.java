package solid.dip.DIP_app;

import solid.dip.DIP_ref_2.*;


import java.util.Scanner;

public class PSWmanagerRef_2 {

	public static void main(String[] args) {
		
		String usr=null;
		String psw = null;
		String psw2 = null;
		
		ServiceFactory simple = new SimpleGeneratorFactory();
		ServiceFactory special = new SpecialGeneratorFactory();

		 I_PSWGeneratorServiceRef_2 siG =  simple.createPSWgenerator();   // it was: new PSWGeneratorRef_2();
	     I_PSWGeneratorServiceRef_2 spG = special.createPSWgenerator(); // it was: new SpecialPSWGenerator();
	     

		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Enter your username: ");
	     usr = scanner.nextLine();  
		 psw = siG.getRandomPSW();
	    System.out.println("The password is : " + psw);

		System.out.print("Enter again your username for special password: ");
	     usr = scanner.nextLine();  
		 psw2 = spG.getRandomPSW();
	    System.out.println("The password is : " + psw2);
	     
	}

}
