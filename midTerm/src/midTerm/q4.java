package midTerm;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total meters travelled: ");
		double meter = sc.nextDouble();
		
		System.out.println("Enter hours: ");
		double hours = sc.nextDouble();
		
		System.out.println("Enter minutes:");
		double minutes = sc.nextDouble();
		
		System.out.println("Enter seconds: ");
		double seconds = sc.nextDouble();
		
		double totalSecond = (hours*60*60)+(minutes*60)+seconds;
		
		double mPerS = meter/totalSecond;
		System.out.println("The value of meter per second is: " + mPerS);
		
		sc.close();
	}

}
