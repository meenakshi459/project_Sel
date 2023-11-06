package week3.day1;

public class Safari_inheri extends Browser {

public void readMe() {
		
		System.out.println("readMe - From Safari Class");
	}


	public void fullScreenMode() {
		
		System.out.println("fullScreenMode - From Safari Class");
	}

				
	public static void main(String[] args) {
		
		Safari_inheri access= new Safari_inheri();
		access.openURL();
		access.navigateBackr();
		access.readMe();
		access.fullScreenMode();
			
		
		
	}

}
