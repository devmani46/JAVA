package clasroomProjects;

import java.util.Scanner;

public class one27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = sc.nextLine();
		
		int space = fullName.indexOf(" ");
		String first = fullName.substring(0,0+1);
//		char first = fullName.charAt(0);
		String last = fullName.substring(space+1,fullName.length());
		
		System.out.println("Your name is: " + last + ", "+ first.toUpperCase() + ".");
		
		sc.close();
	}

}
