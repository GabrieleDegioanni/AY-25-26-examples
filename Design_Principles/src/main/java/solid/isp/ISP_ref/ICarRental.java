package solid.isp.ISP_ref;

public interface ICarRental extends IRentalRef{

	public void setBabySeat(int n);
	public void setUlimimitedKM(boolean unlimitedKM);
	public int getBabySeat();
	public boolean getUnlimitedKm();
	
}
