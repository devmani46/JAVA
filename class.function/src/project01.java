//10	12	9	8	7	15	11	30
public class project01 {

	public static void main(String[] args) {
		funcAmount(10,"Person 1");
		funcAmount(12,"Person 2");
		funcAmount(9,"Person 3");
		funcAmount(8,"Person 4");
		funcAmount(7,"Person 5");
		funcAmount(15,"Person 6");
		funcAmount(11,"Person 7");
		funcAmount(30,"Person 8");
		
	}
	public static void funcAmount(double amount, String name) {
		double totalAmount = amount + (0.05*amount)+(0.15*amount);
		System.out.println("The total amount paid by"+name+"is :" + totalAmount);
	}

}
