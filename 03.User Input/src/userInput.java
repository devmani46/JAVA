import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
		Scanner scannerName = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scannerName.nextLine();
		
		System.out.println("How old are you?");
		int age = scannerName.nextInt();
		
		
		scannerName.nextLine(); //clearing the nextLine's newline
		/* 
		 *nextLine's newline must be cleared before using it
		 *ahead of new nextLine scanner
		 */
		
		
		System.out.println("what is your favorite food?");
		String food = scannerName.nextLine();

		System.out.println("What is your fav number?");
		int number = scannerName.nextInt();
		
		System.out.println("Hello "+name);
		System.out.println("You are " +age+" years old");
		System.out.println("You like "+ food);
		System.out.println("Your fav number is " + number);
		
		scannerName.close();
	}
}
