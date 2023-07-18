package task8;

import java.util.Scanner;

public class q4bii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum =0;
		
		for (i=1;i<=10;i++) {
			System.out.println("Enter number "+i);
			int input = sc.nextInt();
			sum +=input;
			if (input==0) {
				break;
			
				
		
			}
			sc.close();
		}
		System.out.println("the sum is: "+sum);
		
	}

}
