//initialize two variables with email and password. Use scanner class to
// ask user for email and password. If the email and password matches with
// the data stored in the variables ten display a message saying:
// Hello, {user name}.
// If the user name and password does not match. Re prompt the user asking
// them to provide the credentials again.
// Take out the user name from the email by grabbing the first part before
// the provided email domain.
package task8cont;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
	
		String userEmail = "dev@gmail.com";
		String userPassword = "9845622244";
		boolean condition;
		
		do {
			
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your email: ");
		String email = sc.nextLine().trim();
		
		int user = email.indexOf("@");
		String userName = email.substring(0,user);
	
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		condition = email.equals(userEmail) && password.equals(userPassword);
		if(email.equals(userEmail) && password.equals(userPassword)) {
			System.out.println("Hello "+userName);
		}
		else {
			System.out.println("Enter Your correct email ID please!");
		}
		}while(!condition);
		

}
}
