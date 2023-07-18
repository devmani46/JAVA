
public class TotalSum {
	public static void funcAmount(double amount, String name) {
		double totalAmount = amount + (0.05*amount)+(0.15*amount);
		System.out.println("The total amount paid by"+name+"is :" + totalAmount);
	}
	
}
