package tw_portal;

public class Inh_Car extends Inh_Vehicle {

	public void airBags() {
		
		System.out.println("Apply airBags");
		
	}
	
	public static void main (String[] args) {
		Inh_Car car= new Inh_Car();
		
		car.applyBreak();
		car.airBags();
		car.horns();
		
	}
	
	  
		
	}
	
	

