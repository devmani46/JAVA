import java.util.Scanner;

public class logOp {

	public static void main(String[] args) {
		/*
		 * 			&& = (AND) both conditions must be true
		 * 			|| =(OR) either condition must be true
		 * 			! = (NOT) reverses boolean valuer of condition
		 */
		
		Scanner tem = new Scanner(System.in);
		System.out.println("Enter temperature");
		double temp = tem.nextDouble();
		if (temp>20) {
			System.out.println("It IS HOT OUTSIDE");
		}
		else if(temp>10 && temp<20){
			System.out.println("It is moderate");
		}
		else{
			System.out.println("It is cold");
		}
		
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("You are playing a game! press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("Q") || response.equals("q") || response.equals("Quit")|| response.equals("quit")) {
			System.out.println("You quit the game");
			
		}
		else {
			System.out.println("You are still in the game");
		}
		
		
		// boolean shortcut
		int noGoal = 1;
		System.out.println("I scored "+ noGoal + " " + (noGoal==1?"goal":"goals"));
		
		
		tem.close();
		scanner.close();
	}

}
