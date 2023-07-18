package clasroomProjects;

import java.util.Scanner;

public class oddEven {
	public static void main(String args[]) {
	Scanner scannerName = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = scannerName.nextInt();
	if(num%2 == 0) {	
		System.out.println("It is even number"); 
	}
	else {
		System.out.println("It is odd number");
	}
	scannerName.close();
}
}
