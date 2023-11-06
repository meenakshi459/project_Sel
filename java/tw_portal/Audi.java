package tw_portal;

public class Audi extends Inh_Car {

 public void music() {
	 
	 System.out.println("Apply Music");
 }
 
public void lights() {
	 
	 System.out.println("Apply lights");

}

public static void main (String[] args) {
	
		Audi cals = new Audi();
		
		cals.airBags();
		cals.horns();
		cals.applyBreak();
		cals.lights();
		cals.music();
			
			
		
	
}

}
