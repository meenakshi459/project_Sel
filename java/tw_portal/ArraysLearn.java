package tw_portal;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysLearn {

	public static void main(String[] args) {
		
    // Below is the Arrays value without sorting

     int[] marks= {67,49,76,55,68};
     
    // System.out.println(marks[1]);
     
     int firstMark= marks[0];
     System.out.println("First Mark= "+firstMark);
     
     int length = marks.length;
     System.out.println("Length of Marks is = "+length);
     
     // after Sorting the Arrays
     
     Arrays.sort(marks);
     
     System.out.println("After Sorting marks= "+marks[0]);
     System.out.println("After Sorting marks= "+marks[1]);
     System.out.println("After Sorting marks= "+marks[2]);
     System.out.println("After Sorting marks= "+marks[3]);
     System.out.println("After Sorting marks= "+marks[4]);
     
     // to get the maximum value of the Arrays
     
     System.out.println("Maximum Value of the Marks= "+marks[marks.length-1]);
     
     // to print all the values of Array in Ascending Order 
     
    for (int i = 0; i <length; i++) {
    	
    	System.out.println(marks[i]);
		
	}
    
    // to print in reverse
    
    System.out.println("Reversed Marks as Below: ");
    
       for (int i=length-1;i>=0;i-- ) {
    
   
         System.out.println(marks[i]);
		
	}     
         
         

	}
	
}


