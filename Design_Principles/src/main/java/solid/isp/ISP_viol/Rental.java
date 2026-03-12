package solid.isp.ISP_viol;

import java.time.LocalDate;
import java.util.random.RandomGenerator;


public class Rental {


	private LocalDate from;
	private LocalDate to;
	private int babySeat;
	private boolean unlimitedKM;
	private int insuranceLevel;
	
	public Rental() {
		
		this.from = null;
		this.to = null;
		this.babySeat = 0;
		
	}

	 
	public void setFrom(String stringFromDate) {
		this.from = LocalDate.parse(stringFromDate);
	}

	
	public void setTo(String stringToDate) {
		this.to = LocalDate.parse(stringToDate);	
	}

	
	public boolean isAvailable() {
		
		return RandomGenerator.getDefault().nextBoolean();
				
	}

	
	public void setBabySeat(int n) {

		this.babySeat = n;
	}


	public void setUlimimitedKM(boolean unlimitedKM) {
		this.unlimitedKM = unlimitedKM;
		
	}
	
	public void setInsuranceLevel(int n){
		this.insuranceLevel = n;
	}
	public int getInsuranceLevel(){
		return this.insuranceLevel;
	}
	
	
	
}
