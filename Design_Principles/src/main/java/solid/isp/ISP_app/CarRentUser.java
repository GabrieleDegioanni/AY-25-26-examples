package solid.isp.ISP_app;


import solid.isp.ISP_viol.Rental;


public class CarRentUser {

	public static void main(String[] args) {
		
		Rental carRental = new Rental();
		
		carRental.setFrom("2026-04-05");
		carRental.setTo("2026-04-15");
		
		boolean avCar = carRental.isAvailable();
		
		if(avCar){ 
		carRental.setBabySeat(2);
			System.out.println("Car rental booked with " + 2 + " baby seats" );
		} else {
			System.out.println("Car not available");
		}
		
	}

}
