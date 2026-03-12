package solid.dip.DIP_viol.generators;

import java.util.Random;


public class PSWGenerator {

	Random r;
	
	public PSWGenerator() {
	
		r = new Random();
			
	}

	public String getRandomPass() {
		
		return Integer.toHexString(r.nextInt());
		//return r.nextInt();
	}
	
}
