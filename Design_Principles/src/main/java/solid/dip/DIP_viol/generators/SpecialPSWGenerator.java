package solid.dip.DIP_viol.generators;

import java.util.Random;

public class SpecialPSWGenerator {


    Random r;
    
    
    public SpecialPSWGenerator() {
    	r = new Random();
    }
    	
	
	public String getRandomPSW() {
		
		return Double.toHexString(r.nextGaussian());
	}

}
