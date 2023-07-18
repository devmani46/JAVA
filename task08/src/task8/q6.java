package task8;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		System.out.println("Enter the alphabet you want to count: ");
		String alp = sc.nextLine();
		
		int i,count =0;
		
		for(i=0;i<word.length();i++) {
			String a = sc.nextLine();
//			System.out.println(a);
//			a.toString();
			
				if(a.equals(alp)) {
					count++;
				}
				sc.close();		
				}
		System.out.println(count);
		
	}
}


