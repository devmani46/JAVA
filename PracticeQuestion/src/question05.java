import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.print("Input your first item: ");
		String firstItem = input1.nextLine();
	
		
		Scanner input1Price = new Scanner(System.in);
		System.out.print("Input its price in dollar :$");
		Double input1Price1 = input1Price.nextDouble();
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Input your second item: ");
		String secondItem = input2.nextLine();

		Scanner input2Price = new Scanner(System.in);
		System.out.print("Input its price in dollar :$");
		Double input2Price2 = input2Price.nextDouble();
		
		Scanner input3 = new Scanner(System.in);
		System.out.print("Input your third item: ");
		String thirdItem = input3.nextLine();
		
		Scanner input3Price = new Scanner(System.in);
		System.out.print("Input its price in dollar :$");
		Double input3Price3 = input3Price.nextDouble();
		
		//converting into neplease rupees
		double nepInput1Price = input1Price1 * 122.87;
		double nepInput2Price = input2Price2 * 122.87;
		double nepInput3Price = input3Price3 * 122.87;
		
		//printing (a)
		System.out.println("Raj bought " + firstItem + " for Rs."+nepInput1Price);
		System.out.println("Raj bought " + secondItem + " for Rs."+nepInput2Price);
		System.out.println("Raj bought " + thirdItem + " for Rs."+nepInput3Price);
		
		//question (b)
		double totalPrice = nepInput1Price + nepInput2Price + nepInput3Price;
		double discount = 0.12;
		double discountPrice = totalPrice - (totalPrice * discount);
		System.out.println("Raj final price after he got 12% discount is Rs." + discountPrice);
		
		
		
		//question (c)
		double tax = 0.13;
		double taxPrice = discountPrice + (discountPrice*tax);
		System.out.println("Raj final price after adding 13% tax is Rs."+ taxPrice);
		
		input1.close();
		input1Price.close();
		input2.close();
		input2Price.close();
		input3.close();
		input3Price.close();
	}

}
