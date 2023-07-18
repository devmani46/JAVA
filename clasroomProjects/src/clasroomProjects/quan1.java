package clasroomProjects;

import java.util.Scanner;

public class quan1 {

	public static void main(String[] args) {
		Scanner scannerName = new Scanner(System.in);
		
		System.out.print("Input item name:");
		String itemName = scannerName.nextLine();
		
		System.out.print("Enter item price: ");
		double itemPrice = scannerName.nextInt();
		
		System.out.println("Quantity of the item: ");
		double itemQuan = scannerName.nextInt();
		
		if(itemQuan == 0) {
			System.out.println(itemName + " is out of stock");
		}
		else if (itemQuan == 1) {
			System.out.println(itemName + " costs Rs." + itemPrice);
		}
		else if(itemQuan >1) {
			
//		int nameLength = itemName.length() - 1;
//		if(itemName.substring(nameLength).equals("s")) {
		if(itemName.substring(itemName.length() -1).equals("s")) {
		
				System.out.println(itemName + " cost Rs." + (itemPrice*itemQuan));
			}
		else {
		System.out.println(itemName + "s" + " cost Rs." + (itemPrice*itemQuan));
		}
		}
		
		else {
			System.out.println("Please enter valid numbers");
		}
		
		scannerName.close();
		}

}
