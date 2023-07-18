package modelQuestion;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		String upper = a.toUpperCase();
		String lower = a.toLowerCase();
		
		System.out.println("The uppercase is "+ upper);
		System.out.println("The lowercase is"+ lower);
		
//		System.out.println("The uppercase is "+ a.toUpperCase());
//		System.out.println("The lowercase is"+ a.toLowerCase());
		
		sc.close();
	}

}
