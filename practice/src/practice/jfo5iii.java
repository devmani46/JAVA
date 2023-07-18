package practice;

import java.util.Scanner;

public class jfo5iii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a code: ");
		int code = sc.nextInt();
		
		switch(code) {
		case 1:
			System.out.println("The next Traffic Light is Green");
			break;
		case 2:
			System.out.println("The next Traffic Light is Yellow");
			break;
		case 3:
			System.out.println("The next Traffic Light is Red");
			break;
		default:
			System.out.println("Invalid color");
		}
		sc.close();
	}

}
