package solid.dip.DIP_ref_2.generators;

import java.util.Random;
import solid.dip.DIP_ref_2.I_PSWGeneratorServiceRef_2;

public class PSWGeneratorRef_2 implements I_PSWGeneratorServiceRef_2 {

	Random r;
	
	public PSWGeneratorRef_2() {
	
		r = new Random();
			
	}

	@Override
	public String getRandomPSW() {
		return Integer.toHexString(r.nextInt());
	}
	
}
