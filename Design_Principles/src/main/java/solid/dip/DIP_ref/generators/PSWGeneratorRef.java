package solid.dip.DIP_ref.generators;

import java.util.Random;
import solid.dip.DIP_ref.*;

public class PSWGeneratorRef implements I_PSWGeneratorServiceRef {

	Random r;
	
	public PSWGeneratorRef() {
	
		r = new Random();
			
	}

	@Override
	public String getRandomPSW() {
		return Integer.toHexString(r.nextInt());
	}
	
}
