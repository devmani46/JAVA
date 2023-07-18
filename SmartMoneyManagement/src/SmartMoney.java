import java.util.Scanner;

public class SmartMoney {
	static double mSalary;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your monthly salary: ");
		mSalary = sc.nextDouble();
		
		expenditure.Expenditure1(mSalary);
		sc.close();

	}

}
