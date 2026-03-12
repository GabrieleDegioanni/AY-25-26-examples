package solid.dip.DIP_viol;

import solid.dip.DIP_viol.generators.PSWGenerator;

public class PSWGeneratorService {

	private PSWGenerator nm; 
	
	public PSWGeneratorService() {
		nm = new PSWGenerator();
	}
	
	public String getRandomPSW() {
		return nm.getRandomPass();
	}
	
	
}
