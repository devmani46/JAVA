package task8cont;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your name: ");
		String userName = sc.nextLine();
		
		System.out.print("Enter your password: ");
		String userPassword = sc.nextLine();
		
		System.out.println("Select Your Email Domain:");
		System.out.println("1. @gmail.com");
		System.out.println("2. @yahoo.com");
		System.out.println("3. @hotmail.com");
		
		int domain = sc.nextInt();
		
		switch(domain) {
		case 1:
			System.out.println("Hello "+userName+".Your details are:");
			System.out.println("Your user ID is: "+userName+"@gmail.com");
			
		break;
		case 2:
			System.out.println("Hello "+userName+".Your details are:");
			System.out.println("Your user ID is: "+userName+"@yahoo.com");
		break;
		case 3:
			System.out.println("Hello "+userName+".Your details are:");
			System.out.println("Your user ID is: "+userName+"@hotmail.com");
		break;
		default:
			System.out.println("Invalid Domain ID selected");
		}
		System.out.println("Your Password is :"+userPassword);
		
	}

}
