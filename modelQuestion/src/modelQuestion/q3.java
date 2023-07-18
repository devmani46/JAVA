package modelQuestion;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double a = sc.nextDouble();
		
		if(a%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd number");
		}
		sc.close();
	}

}
