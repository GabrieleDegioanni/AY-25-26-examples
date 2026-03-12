package solid.isp.ISP_app;


import solid.isp.ISP_ref.*;


public class CarRentUserRef {

	public static void main(String[] args) {
		
		ICarRental carRental = new RentalRef();
		
		carRental.setFrom("2026-04-05");
		carRental.setTo("2026-04-15");
		
		
		boolean avCar = carRental.isAvailable();
		
		if(avCar){ 
		carRental.setBabySeat(2);
		
			System.out.println("Car rental booked with " + 2 + " baby seats" );
		} else 
			System.out.println("Car not available");
	
		
	}

}
