package week1.day2;

import java.util.Scanner;

public class EvenODDnum {

	public static void main(String[] args) {

       int num1;
       
       System.out.println("Enter the Number:");
       
       Scanner scan= new Scanner(System.in);
       num1=scan.nextInt();
       
       
       if (num1%2==0) {
    	   
    	   System.out.println("Number is Even");
       }
    		   
       else{
    	   System.out.println("Number is ODD");
       }
	}
	

}
