package solid.isp.ISP_app;


import solid.isp.ISP_ref.*;



public class VanRentUserRef {

	public static void main(String[] args) {
		
		
		IVanRental vanRental = new RentalRef();
		vanRental.setFrom("2026-04-05");
		vanRental.setTo("2026-04-15");

		boolean avTr = vanRental.isAvailable();
		if(avTr){
			vanRental.setInsuranceLevel(4);
			System.out.println("Van rental booked with insurance level " + 4);
		}
		else 
			System.out.println("Van not available");
	
	}

}
