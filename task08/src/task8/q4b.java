package task8;

import java.util.Scanner;

public class q4b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 0;
		System.out.println("Enter number: ");
		double n1,n2=0,n3;
		
		while (n==0) {
			for(int i=0;i<=n;i++) {
				n1 = sc.nextDouble();
				n3 = n1+n2; 
				if(n1==0) {
					n=0;
					
					System.out.println("sum is "+ n3);
				break;	
				}
				n1=n2;
				n2=n3;	
			}
			
		}
		sc.close();
}
}