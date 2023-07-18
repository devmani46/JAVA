package midTerm;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
		
		System.out.println("The addition of two numbers is: "+add);
		System.out.println("The subtraction of two numbers is: "+sub);
		System.out.println("The multiplication of two numbers is: "+mul);
		System.out.println("The division of two numbers is: "+div);
		System.out.println("The remainder of two numbers is: "+mod);
		sc.close();
	}

}
