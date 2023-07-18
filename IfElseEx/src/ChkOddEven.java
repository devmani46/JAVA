import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double a = sc.nextDouble();
		
		if ( a%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
		sc.close();
	}

}
