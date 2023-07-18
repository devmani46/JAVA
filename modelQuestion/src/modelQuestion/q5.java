package modelQuestion;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String a = sc.nextLine();
		
		System.out.println("Enter a boolean: ");
		Boolean b = sc.nextBoolean();
		
		System.out.println("Enter a number: ");
		Double c = sc.nextDouble();
		
		System.out.println("Your word is "+a);
		System.out.println("Your boolean is "+ b);
		System.out.println("Your number is "+c);
		sc.close();
	}

}