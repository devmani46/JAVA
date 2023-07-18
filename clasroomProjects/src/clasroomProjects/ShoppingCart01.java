package clasroomProjects;

public class ShoppingCart01 {

	public static void main(String[] args) {
		String custName = "Dev";
		String itemDesc= "hoodie";
		String variableMessage = " wants to buy this ";
		double price = 25;
		double tax = price * 0.13;
		int quantity = 2;
		double totalPrice = (price + tax) * quantity;
		String concatenated = custName + variableMessage +quantity +" " + itemDesc;
		System.out.println(concatenated);
		System.out.println("Total cost including tax is: $" + totalPrice);
		
	}

}
