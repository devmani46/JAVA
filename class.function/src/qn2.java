
public class qn2 {
	public static void price(String name,double apple,double banana, double orange) {
		double applePrice = 300;
		double bananaPrice = 150;
		double orangePrice = 250;
		double bApple = applePrice + 75;
		double bOrange = orangePrice + 50;
		double bBanana = bananaPrice - 50;
		double totalAmount = (apple*applePrice) +(banana * bananaPrice) + (orange * orangePrice);
		System.out.println(name + " paid a total of : Rs"+totalAmount);
		
		double bTotalAmount = (bApple*apple) + (bBanana * banana) + (bOrange * orange);	
		System.out.println(name+" paid a total of Rs"+bTotalAmount+ " when the price is changed");
		}
}
