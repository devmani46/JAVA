package midTerm;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		
		//to lowercase
		String lower = word.toLowerCase();
		System.out.println("The lower case of "+word+" is "+lower);
		
		//to uppercase
		String upper = word.toUpperCase();
		System.out.println("The upper case of "+word+" is "+upper);
		
		//to replicate
		String concat = word.concat(word);
		System.out.println("The concatitation of "+word+" is "+concat);
		
		//to find length
		int length = word.length();
		System.out.println("The lenght of "+word+" is "+ length);
		
		// character at
		char charAt = word.charAt(0);
		System.out.println("The character in 1st of "+word+" is "+ charAt);
		
		//index of
		int index = word.indexOf("a");
		System.out.println("The index of a in "+word+" is "+ index);
	
		sc.close();
	}
	

}
