package week3.day1;

public class Poly_overloading {

	
		
		// Polymorphism means taking many forms
		
		// Overloading-- Multiple name will be same but Arguments (data type/ parameters) will be different.
	
	// example below: 2 methods are having same name but difference in arguments passed. IN main method we can call any method and overload it
				
		
		
		public void reportStep(String msg, String status) {
			
			System.out.println("This is Message for reportStep1"+" "+msg);
			System.out.println("This is Status for reportStep1"+" "+status);
			
		}
		

         public void reportStep(String msg, String status, boolean snap) {
			
	        System.out.println("This is Message for reportStep2"+" "+msg);
	        System.out.println("This is Status for reportStep2"+" "+status);
	        System.out.println("Boolean status is "+" "+snap);
	
		
	}


   public static void main(String[] args) {
	   
	   Poly_overloading overld= new Poly_overloading();
	   overld.reportStep("method1", "status1", false);
	   
	   	   
   }
   
}




