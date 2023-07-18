import java.util.Scanner;

public class AgeCheck {
	public static void main (String[] args) {
		
		System.out.println("IF:");
		System.out.println("2 = 6");
		System.out.println("3 = 12");
		System.out.println("4 = 20");
		System.out.println("Then, What is value of 9? ");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		
		if(ans==90) {
			System.out.println("You are correct");
		}
		else if(ans>90) {
			System.out.println("Wrong Answer. It is lower");
		}
		else {
			System.out.println("Wrong answer. It is higher");
		}
		sc.close();
	}
}
