import java.util.Scanner;

public class function {

	public static void main(String[] args) {
//		double halfDiameter1 = 20;
//		double halfDiameter2 = 10;
//		System.out.println(funcArea);
		Scanner halfDiameter = new Scanner(System.in);
		System.out.print("Enter halfDiameter:  ");
		Double halfDiameter1 =  halfDiameter.nextDouble();
		funcArea(halfDiameter1);
		
		halfDiameter.close();
	
		
	}
	public static void funcArea(double halfDiameter) {
		double area = (22/7)*halfDiameter*halfDiameter;
		System.out.println("Area is: "+ area);
	}
	
}
