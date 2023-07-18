import java.util.Scanner;

public class ifStatement {
	public static void main(String[] args) {
		Scanner scannerName = new Scanner(System.in);

		System.out.print("How old are you? :");
		int age = scannerName.nextInt();
		
//		int age = 18;
		
		if(age>18) {	
			System.out.println("YOU are an adult"); 
		}
		else if(age<=10) {
			System.out.println("You are a child");
		}
		else {
			System.out.println("YOU are 18");
		}
		scannerName.close();
	}
}
