package solid.lsp.LSP_app;

import solid.lsp.LSP_ref.*;

public class Farm_ref {

	public static void main(String[] args) {
		
		FlyingBird aPigeon = new PigeonRef();
		BirdRef aDuck = new DuckRef();
		
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
		//aDuck.fly(); //compilation error

	}

}
