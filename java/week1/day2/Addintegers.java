package week1.day2;

import java.util.Scanner;

public class Addintegers {

	public static void main(String[] args) {
       int num1;
       int num2;
       
       System.out.println("Enter Num to Add:");
       
       Scanner scan = new Scanner(System.in);
       num1= scan.nextInt();
       num2=scan.nextInt();
       
       System.out.println("Addition of numbers are: "+(num1+num2));     
                     
       
	}

}
