package week1.day2;

import java.util.Scanner;

public class PositumTable {

	public static void main(String[] args) {
	
		int num;
		System.out.println("Enter any Positive Integer: "); // get user input for positive integer and store it int num 
		Scanner scan= new Scanner(System.in); // object to get user input scanned by system
		num= scan.nextInt();
		
		
		System.out.println("Multipy table of " + num); 
		for(int i=1;i<=10;i++) {
		System.out.println(num+"X"+i+"="+(num*i));
		}
		
	}

}
