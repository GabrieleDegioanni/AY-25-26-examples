package solid.dip.DIP_ref.generators;

import solid.dip.DIP_ref.I_PSWGeneratorServiceRef;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class SpecialPSWGenerator implements I_PSWGeneratorServiceRef {


    RandomGenerator rng;
    
    
    public SpecialPSWGenerator() {
    	rng = RandomGeneratorFactory.of("SplittableRandom").create();
    }
    
	
	@Override
	public String getRandomPSW() {
		
		return Double.toHexString(rng.nextGaussian());
	}

}
