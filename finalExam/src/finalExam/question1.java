package finalExam;
import java.util.Scanner;
public class question1 {
	 

	public static void main(String[] args) {
		
		String foodName = null;
		double foodPrice = 0;
		int foodQuantity = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Food Name: ");
		foodName = sc.nextLine();
		
		System.out.print("Enter food price:");
		foodPrice = sc.nextDouble();
		
		System.out.print("Enter food quantity");
		foodQuantity = sc.nextInt();
		
		sc.close();
		calcTotal(foodName,foodPrice,foodQuantity);
	}
	public static void calcTotal(String fN,double fP,int fQ) {
		double totalPrice = fP*fQ;
		toString(fN,fP,fQ,totalPrice);
		
	}
	public static void toString(String n,double p, int q, double totalP) {
		System.out.println("You bought "+q+" "+n+" which costs"+p+".");
		System.out.println("Total amount is: Rs"+totalP);
		
	}


	public class rest{
		String foodName;
		double foodPrice;
		
		rest(String foodName,double foodPrice){
			this.foodName = foodName;
			this.foodPrice = foodPrice;
		}
		
	}
	
}
