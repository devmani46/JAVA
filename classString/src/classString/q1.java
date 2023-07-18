package classString;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		String custName = "Ram Shrestha";
		int spaceIdx = custName.indexOf(" ");
		System.out.println("The index of space is: "+spaceIdx);
		
		String firstName = custName.substring(0,spaceIdx);
		System.out.println("The first name of the customer is: "+firstName);
		
		String secondName = custName.substring(spaceIdx+1, custName.length());
		System.out.println("The second name of the customer is: "+secondName);
		
		Scanner fullName = new Scanner(System.in);
		System.out.print("Input your full name: ");
		String name = fullName.nextLine();
//		String fn = name1(name);
//		System.out.println(fn);
		name1(name);
		fullName.close();
		
	}
	
//	public static String name1(String fullName) {
	public static void name1(String fullName) {	
		int space1 = fullName.indexOf(" ");
		int space2 = fullName.indexOf(" ",space1+1);
		String first = fullName.substring(0,space1);
		String middle = fullName.substring(space1+1,space2);
		String last = fullName.substring(space2+1,fullName.length());
		System.out.println("The first name of the customer is:"+first);
		System.out.println("The middle name of the customer is:"+middle);
		System.out.println("The last name of the customer is:"+last);
		
//		return first;
		
	}
}
