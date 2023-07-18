package practice;

import java.util.Scanner;

public class jfo5i {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a color code: ");
		double code = sc.nextDouble();
		
		if(code>=380 && code<450) {
			System.out.println("The colour is Violet");
		}
		else if(code>=450 && code<495) {
			System.out.println("The colour is Blue");
		}
		else if(code>=495 && code<570) {
			System.out.println("The colour is Green");
		}
		else if(code>=570 && code<590) {
			System.out.println("The colour is Yellow");
		}
		else if(code>=590 && code<620) {
			System.out.println("The colour is Orange");
		}
		else if(code>=620 && code<750) {
			System.out.println("The colour is Red");
		}
		else {
			System.out.println("The entered value is not a part of the visible spectrum");
		}
		sc.close();
	}

}
