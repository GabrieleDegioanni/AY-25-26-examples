package solid.lsp.LSP_app;

import solid.lsp.LSP_viol.*;

public class Farm {

	public static void main(String[] args) {
		
		Bird aPigeon = new Pigeon();
		Bird aDuck = new Duck();
	
		
		//making eggs
		for(int i=0;i<5;i++) {
			aPigeon.makeEgg();
		}
		
		for(int i=0;i<4;i++) {
			aDuck.makeEgg();
		}
	
		System.out.println("A pigeon made " + aPigeon.getEggsCount() + " eggs" );
		System.out.println("A duck made " + aDuck.getEggsCount() + " eggs" );
		
		
		//flying
		aPigeon.fly();
		aDuck.fly(); //undefined behavior


	}

}
