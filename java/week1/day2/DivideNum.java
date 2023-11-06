package week1.day2;

import java.util.Scanner;

public class DivideNum {

	public static void main(String[] args) {

        int num1;
        
        System.out.println("Enter number to get Divided");
        
        Scanner scan=new Scanner(System.in);
         num1=scan.nextInt();
         
         for(int i=	1;i<=10;i++){
        	 
        	 System.out.println(num1+" "+"Divided By"+" "+i+"= "+(num1/i));
        	 
         }
         
        

	}

}
