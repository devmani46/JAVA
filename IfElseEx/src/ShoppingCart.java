import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the pirce");
		double quanPrice = sc.nextDouble();
		
		System.out.println("Enter quantity");
		int quan = sc.nextInt();
		

		boolean outOfStock = true;
		
		if(quan>1) {
			outOfStock = false;
		}
		else {
			outOfStock = true;
		}
		
		if(outOfStock) {
			System.out.println("Sorry, the item is unavaliable");
		}
		else {
			System.out.println("Your total cost is " + (quanPrice*quan));
		}
	}

}
