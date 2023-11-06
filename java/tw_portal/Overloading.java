package tw_portal;

public class Overloading {

	public void add(int num1, int num2) {
		
		System.out.println(num1+num2);	
		
	}
	
	public void add (int num1, int num2, int num3) {
		
		System.out.println(num1+num2+num3);
	}
	
	
	public void add (int num1, int num2, double num3) {
		
		System.out.println(num1+num2+num3);
	}
	
	public static void main(String[] args) {

       Overloading calc= new Overloading();
       
       calc.add(34, 34, 45.5);
       calc.add(34, 78);
           
       }

}
