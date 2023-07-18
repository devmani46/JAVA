package task10;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[5];
		for(int i=0;i<5;i++) {
			String subjetName[]= {"SF","OOP","DS","COA","GUI"};
			System.out.print("Enter your marks in "+subjetName[i]+":");	
			marks[i]=sc.nextInt();
			
		}
		int avg =0, sum = 0;
		for(int mark:marks) {
			sum += mark;
			avg = sum/5;
		}
		System.out.print("Your average mark is: "+avg);
		sc.close();
	}

}
