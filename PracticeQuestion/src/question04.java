import java.util.Scanner;

//a java application that takes input in feet and converts it into the meter,
//centimeter, and inch.
public class question04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input value in Feet: ");
		double feet = input.nextDouble();

		
		//converting feet into meter
		double meter = feet * 0.3048;
		System.out.println("Your value in meter is " + meter + "m");
		
		//converting feet into centimeter
		double centimeter = feet * 30.48;
		System.out.println("Your value in centi-meter is " + centimeter + "cm");
		
		//converting feet into inch
		double inch = feet * 12;
		System.out.println("Your value in inch is " + inch + "inch");
		
		input.close();
	}

}
