import java.util.Scanner;

public class invest {
	
	static String invest1;
	static double invest20,invest30,invest40,invest50,invest60;
	public static void inBusiness(double investment) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(investment);
		if(investment>0) {
		System.out.println("You haved saved a total of "+ investment + " till now");
		System.out.print("Do you want to invest this money in the business? :");
		invest1 = sc.nextLine().toLowerCase();
		
		if(invest1.equals("yes")) {
			System.out.println("The percentage of saving you want to invest is given below, please select a number: ");
			System.out.println("1. 20%");
			System.out.println("2. 30%");
			System.out.println("3. 40%");
			System.out.println("4. 50%");
			System.out.println("5. 60%");
			int percent = sc.nextInt();
			int[] per = {20,30,40,50,60};
			switch(percent) {
			case 1:
				invest20 = (0.2 * investment);
				System.out.println("You have invested Rs"+invest20);
				System.out.println("You have a saving of Rs"+(investment - invest20)+" after investing " +per[0]+"% in the business.");
				break;
			case 2:
				invest30 = (0.3 * investment);
				System.out.println("You have invested Rs"+invest30);
				System.out.println("You have a saving of Rs"+(investment - invest30)+" after investing " +per[1]+"% in the business.");
				break;
			case 3:
				invest40 = (0.4 * investment);
				System.out.println("You have invested Rs"+invest40);
				System.out.println("You have a saving of Rs"+(investment - invest40)+" after investing " +per[2]+"% in the business.");
				break;
			case 4:
				invest50 = (0.5* investment);
				System.out.println("You have invested Rs"+invest50);
				System.out.println("You have a saving of Rs"+(investment - invest50)+" after investing " +per[3]+"% in the business.");
				break;
			case 5:
				invest60 = (0.6 * investment);
				System.out.println("You have invested Rs"+invest60);
				System.out.println("You have a saving of Rs"+(investment - invest60)+" after investing " +per[4]+"% in the business.");
				break;
			default:
				System.out.println("You can only invest from 20% to 60%");
			}
		}
			sc.close();
		}
		
	}

}
