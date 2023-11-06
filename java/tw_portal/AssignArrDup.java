package tw_portal;

import java.util.Arrays;

public class AssignArrDup {

	public static void main(String[] args) {
		
		// Identify the Duplicate Numbers from the given numbers
		
		int[] num = {2,5,7,7,5,9,2,3};
		
		Arrays.sort(num);		
		
		for (int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if (num[i]==num[j]) {
				
				System.out.println("Duplicate Numbers are as below: "+num[i]);
					
			}
			
			
		}

	}
		
	}
	
}


