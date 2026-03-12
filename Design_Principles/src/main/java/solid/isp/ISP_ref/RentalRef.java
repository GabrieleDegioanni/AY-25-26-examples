package solid.isp.ISP_ref;

import java.time.LocalDate;
import java.util.random.RandomGenerator;


public class RentalRef implements ICarRental, IVanRental{


	private LocalDate from;
	private LocalDate to;
	private int babySeat;
	private boolean unlimitedKM;
	private int insuranceLevel;
	
	public RentalRef() {
		
		this.from = null;
		this.to = null;
		this.babySeat = 0;
		
	}

	@Override 
	public void setFrom(String stringFromDate) {
		this.from = LocalDate.parse(stringFromDate);
	}

	@Override 
	public void setTo(String stringToDate) {
		this.to = LocalDate.parse(stringToDate);	
	}

	@Override
	public boolean isAvailable() {
		
		return RandomGenerator.getDefault().nextBoolean();
				
	}

	@Override
	public void setBabySeat(int n) {

		this.babySeat = n;
	}

	@Override
	public void setUlimimitedKM(boolean unlimitedKM) {
		this.unlimitedKM = unlimitedKM;
		
	}

	@Override
	public void setInsuranceLevel(int n) {
		
		this.insuranceLevel = n;
	}

	@Override
	public int getInsuranceLevel() {
		return this.insuranceLevel;
	}

	@Override
	public int getBabySeat() {
		return this.babySeat;
	}

	@Override
	public boolean getUnlimitedKm() {
		return this.unlimitedKM;
	}
	
	
	
	
}
