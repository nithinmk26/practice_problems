package UpcastingDowncasting;

public class UpDownEXample {

	public static void upcastingFunctionality() {
		//		Sim sim = new Sim();
		Sim simAirtel = (Sim)new Airtel();
		Sim simJio = new Jio();
		if(simJio instanceof Airtel) {
			Airtel airtelChild = (Airtel)simAirtel;
			airtelChild.sms();

		}

		System.out.println("-----------");

		simAirtel.browsing();
		simAirtel.calling();

		System.out.println("-----------");

		simJio.browsing();
		simJio.calling();
	}
	
	public static void downcastingFunctionality() {

	}

	public static void main(String[] args) {
//		Sim sim = new Sim();
//		Airtel airtel = new Airtel();
//		Jio jio = new Jio();
//
//		sim.browsing();
//		sim.calling();
//
//		System.out.println("-----------");
//
//		airtel.browsing();
//		airtel.calling();
//
//		System.out.println("-----------");
//
//		jio.browsing();
//		jio.calling();
		upcastingFunctionality();

	}

}
