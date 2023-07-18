import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name1 = sc.nextLine();
		String name = name1.toLowerCase();
		
		if(name.equals("moe")) {
			System.out.println("You are the king of rock and roll");
		}
		else {
			System.out.println("You are not the king");
		}
	}

}
