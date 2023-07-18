package clasroomProjects;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		Scanner movieName = new Scanner(System.in);
		System.out.print("Enter your movie name: ");
		String name = movieName.nextLine();
		
		
		Scanner moviePrice = new Scanner(System.in);
		System.out.print("Enter the price of movie: ");
		double price = moviePrice.nextDouble();
		
		Scanner movieRate = new Scanner(System.in);
		System.out.print("Enter the rating of the movie: ");
		Double rating = movieRate.nextDouble();
		
//		if(price <= 12 && rating == 5) {
//			System.out.println("I'm intrested in watching the movie");
//		}
//		else {
//			System.out.println("I'm not intrested in watching the movie");
//		}

		System.out.println((price <= 12 && rating == 5?"I'm intrested in watching the movie":"I'm not intrested in watching the movie"));
		movieName.close();
		moviePrice.close();
		movieRate.close();
		
	}

}
