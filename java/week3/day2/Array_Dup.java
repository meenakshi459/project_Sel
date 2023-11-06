package week3.day2;

public class Array_Dup {

	public static void main(String[] args) {
	
		int[] num = {2,5,7,7,5,9,2,3};
		
		// to get the index values of each number ex: first it will take index as '0'
		
		for (int i=0; i<num.length;i++) {
			
			// inner loop, this is to compare values of index 0 against index 1, 2, 3 
			
			for (int j= i+1; j<num.length;j++) {
				
				if (num[i]==num[j]) {
					
					System.out.println("Duplicate Numbers are: "+num[i]);
					
				}
					
					
					}
				}
			}
		}
		
		

	


