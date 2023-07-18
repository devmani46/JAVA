/*Question 3
 * 
 */

package clasroomProjects;

import java.util.Scanner;

public class distance1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in meter: ");
		double meter = sc.nextDouble();
		
		System.out.print("Enter total hours: ");
		double hour = sc.nextDouble();
		
		System.out.print("Enter minutes coverd: ");
		double minute = sc.nextDouble();
		
		System.out.print("Enter second covered: ");
		double second = sc.nextDouble();

		
		double hour1 = hour * 60 * 60 ;
		double minute1 = minute*60;
		double totalSecond = hour1 + minute1 + second;
		
		double km = meter/1000;
		
		
		System.out.println("Meter per second is: "+ meter/totalSecond);
		System.out.println("Kilometer per second is: "+ km/totalSecond);
		sc.close();
	}

}
