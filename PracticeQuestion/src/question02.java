
public class question02 {

	public static void main(String[] args) {
		//given
		double oneKatana = 250000;
		double twoKatana = 300000;
		double threeKatana = 450000;
		double oneSword = 75000;
		double twoSword = 95000;
		double tax = 0.13;
		double priceSum = oneKatana + twoKatana + threeKatana + oneSword + twoSword;
		
		//question a
		double totalPrice = (priceSum * tax) + priceSum;
		System.out.println("The customer paid a total of Rs " + totalPrice);

		
		//question b
		double discount = 0.07;
		double discountPrice = totalPrice - (discount * totalPrice);
		System.out.println("The customer paid after 7% discount is Rs "+ discountPrice);
		
		//question c
		//short way
		double discountOneKatana = oneKatana-(0.03*oneKatana);
		double discountTwoKatana = twoKatana-(0.04*twoKatana);
		double discountThreeKatana = threeKatana-(0.05*threeKatana);
		
		double totalSum = discountOneKatana + discountTwoKatana + discountThreeKatana + oneSword + twoSword;
		double taxAmount = (0.13 *totalSum)+totalSum;
		System.out.println("The price the customer has to pay is Rs " + taxAmount);
		
		/*
		//long way
		double taxOneKatana = (0.13*discountOneKatana)+ discountOneKatana;
		double taxTwoKatana = (0.13*discountTwoKatana)+ discountTwoKatana;
		double taxThreeKatana = (0.13*discountThreeKatana)+ discountThreeKatana;
		double taxOneSword = (0.13*oneSword)+ oneSword;
		double taxTwoSword = (0.13*twoSword)+ twoSword;
		
		double taxAmount = taxOneKatana + taxTwoKatana + taxThreeKatana + taxOneSword + taxTwoSword;
		System.out.println("The price the customer has to pay is Rs " + taxAmount);
		*/
	}

}
