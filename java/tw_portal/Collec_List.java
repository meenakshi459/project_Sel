package tw_portal;

import java.util.ArrayList;
import java.util.List;

public class Collec_List {

	public static void main(String[] args) {

        //Interface Name<Generic(Type of Data)> list name = new Implementation Class
		
		List<String> students = new ArrayList<>();
		
		students.add("Rhythm");
		students.add("Sri");
		students.add("Sai");
		students.add("kalaivani");
		students.add(1, "Meenakshi");
		students.add(2, "Subha");
		students.add("Vara");
		
		System.out.println(students);
		
		// List Size 
		
		int size = students.size();
		System.out.println("List Size is: "+" "+size);
		
		// Get Method to get particular element via Index
		
		String thirdStudent = students.get(3);
		System.out.println("Third Index Student Name is: "+" "+thirdStudent);
		
		// To remove the element from the List
		
		students.remove(3);
		
		System.out.println(students);
		
		int size1 = students.size();
		System.out.println("List Size is: "+" "+size1);
		
	//  To clear the List , we can use clear Method and Isempty will tell us if any values are there in List or not.
		
		students.clear();
		System.out.println(students);
		System.out.println(students.isEmpty());
		
		  
		
		
		
	}
	  
	
}
