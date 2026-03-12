package solid.dip.DIP_ref_2.generators;

import solid.dip.DIP_ref_2.I_PSWGeneratorServiceRef_2;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class SpecialPSWGenerator_2 implements I_PSWGeneratorServiceRef_2 {


    RandomGenerator rng;
    
    
    public SpecialPSWGenerator_2() {
    	rng = RandomGeneratorFactory.of("SplittableRandom").create();
    }
    
	
	@Override
	public String getRandomPSW() {
		
		return Double.toHexString(rng.nextGaussian());
	}

}
