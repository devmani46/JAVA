package clasroomProjects;

import java.util.Scanner;

public class biggest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		
		System.out.print("Enter third number: ");
		double c = sc.nextDouble();
		
		if(a>b && a>c) {
			System.out.println("The first number " + a + " is biggest number out of the three.");
		}
		else if (b>a && b>c) {
			System.out.println("The second number " + b + " is biggest number out of the three.");
		}
		else {
			System.out.println("The third number " + c + " is biggest number out of the three.");
		}
		sc.close();
	}
	

}
