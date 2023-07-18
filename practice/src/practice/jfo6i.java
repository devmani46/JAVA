package practice;

import java.util.Scanner;

public class jfo6i {
	public static void main(String[] args) {
		int pin = 4693;
	System.out.print("Enter a pin: ");
	while(true){
		Scanner sc = new Scanner(System.in);
		int guessPin = sc.nextInt();
		if(guessPin == pin) {
			System.out.println("Hello user");
			break;
		}
		else {
			System.out.println("Enter pin again");
		}
		sc.close();
	}
	}
}