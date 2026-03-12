package solid.isp.ISP_app;


import solid.isp.ISP_viol.Rental;


public class VanRentUser {

	public static void main(String[] args) {
		
				
		Rental vanRental = new Rental();
		vanRental.setFrom("2026-04-05");
		vanRental.setTo("2026-04-15");

		boolean avTr = vanRental.isAvailable();
		if(avTr)
			System.out.println("Van rental booked");
		else 
			System.out.println("Van not available");

		
	}

}
