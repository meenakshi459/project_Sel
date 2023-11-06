package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		// creating the List , it is always created in ArrayList class
		
		List <String> mentors = new ArrayList<>();
		
		// adding the data to list created
		
		mentors.add("Subraja");
		mentors.add("Vidya");
		mentors.add("Dilip");
		mentors.add(1,"Meenakshi");
		
		System.out.println(mentors);
		
		// to print the size of the list
		
		int size= mentors.size();
		System.out.println("List Size is "+size);
		
		// to get the particular element of the list
		
		String secondele=mentors.get(2);
		System.out.println("Second element is "+secondele);
		
		// to remove the element form the list
		
		mentors.remove(2);
		System.out.println(mentors);
		System.out.println("List Size is "+size);
		
		// To clear/empty the List
		
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
				
		
		
		
	}

}
