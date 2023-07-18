import java.util.Scanner;

public class expenditure {
static double rentFee;
static double saved = 0;

	public static void Expenditure1(double mSalaryR) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you live in rent? :");
		String rent = sc.nextLine().toLowerCase();
		
		if (rent.equals("yes")) {
			System.out.print("Enter your monthly rent fee:");
			rentFee = sc.nextDouble();
			saved = mSalaryR-rentFee;
		}
		else if (rent.equals("no")) {
			saved = mSalaryR;
		}
		else {
			System.out.println("Please enter yes/no");
		}
//		System.out.println(saved);
		

	double food;
	double savedF;

		System.out.print("How much do you spend in food monthly? :");
		food = sc.nextDouble();
		
		savedF = saved - food ;
		Expenditure2.Expenditure3(savedF);
		
	}
	

}
