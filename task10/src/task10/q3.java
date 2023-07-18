package task10;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of browsers you want to store: ");
		int n = sc.nextInt();
		String[] browserName = new String[n];
		int i;
		for(i=0;i<n;i++) {
			if(i==0)
				sc.nextLine();
			
		System.out.println("Enter name of browser "+(i+1)+":");
		browserName[i] = sc.nextLine();
		
		}
		System.out.println(n+ " browers are: " + Arrays.toString(browserName));

		sc.close();
		}
}
