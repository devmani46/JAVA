/*A shopkeeper sells varieties of fruits in his store. He sells apple, bananas, oranges for 300 per kg, 
150 per dozen and 250 per kg respectively. If ram bought 2 kg apple, 3kg oranges ad 2 dozen bananas and 
shyam bought 1kh apple, 4kg oranges and 3dozen bananas, calculate the total amount each customer each customer
has to pay and print the result.
*/
public class q1 {

	public static void main(String[] args) {

//		price("Ram",2,2,3);
//		price("Shyam",1,3,4);
		double asd =price("Shyam",1,3,4); 
		System.out.println(asd);
		
	}
//
//	public static void price(String name,double apple,double banana, double orange) {
//		double applePrice = 300;
//		double bananaPrice = 150;
//		double orangePrice = 250;
//		double bApple = applePrice + 75;
//		double bOrange = orangePrice + 50;
//		double bBanana = bananaPrice - 50;
//		double totalAmount = (apple*applePrice) +(banana * bananaPrice) + (orange * orangePrice);
//		System.out.println(name + " paid a total of : Rs"+totalAmount);
//		
//		double bTotalAmount = (bApple*apple) + (bBanana * banana) + (bOrange * orange);	
//		System.out.println(name+" paid a total of Rs"+bTotalAmount+ " when the price is changed");
//		}
	
	public static double price(String name,double apple,double banana, double orange) {
		double applePrice = 300;
		double bananaPrice = 150;
		double orangePrice = 250;
		double bApple = applePrice + 75;
		double bOrange = orangePrice + 50;
		double bBanana = bananaPrice - 50;
		double totalAmount = (apple*applePrice) +(banana * bananaPrice) + (orange * orangePrice);
		return totalAmount;
	}
	
}
