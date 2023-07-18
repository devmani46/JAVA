import java.util.Scanner;

public class Expenditure2 {
	
	static double transFee;
	static double transportation;
	static double savedT;
	public static void Expenditure3(double savedF1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you use vechile for transporation? :");
		String trans = sc.nextLine().toLowerCase();
		
		if (trans.equals("yes")) {
			System.out.print("Enter your monthly transportation expense:");
			transFee = sc.nextDouble();
			savedT = savedF1-transFee;
		}
		else if (trans.equals("no")) {
			savedT = savedF1;
		}
		else {
			System.out.println("Please enter yes/no");
		}
//		System.out.println(savedT);
		Expenditure4(savedT);
		sc.close();
		}
	static double clothes;
	static double savedC;
	public static void Expenditure4(double savedT1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How much do you spend in clothes monthly? :");
		clothes = sc.nextDouble();
		
		savedC = savedT1 - clothes ;
//		System.out.println(savedC);
		Expenditure5(savedC);
		sc.close();
	}
	
	static double hobbies;
	static double savedH;
	public static void Expenditure5(double savedC1) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How much do you spend in your hobbies monthly? :");
		hobbies = sc.nextDouble();
		
		savedH = savedC1 - hobbies ;
		
		if(savedH<0) {
			System.out.println("Your expense is exciding your monthly salary by Rs"+(savedH*-1));
			System.out.println("Please use your money wisely.");
		}
		

		invest.inBusiness(savedH);
		sc.close();
	}
	


}
