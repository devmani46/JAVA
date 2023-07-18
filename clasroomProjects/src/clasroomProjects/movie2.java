package clasroomProjects;

import java.util.Scanner;

public class movie2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of movie: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter the rating of the movie: ");
		Double rating = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("Enter the genre of the movie: ");
		String genreA = sc.nextLine();
		String genre = genreA.toLowerCase();
		
		if(price <= 12 && rating == 5 && genre.equals("action") || (price <= 20 && genre.equals("sci-fi"))) {
			System.out.println("I'm intrested in watching the movie");	
		}
		else {
			System.out.println("I'm not intrested in watching the movie");
		}

//		System.out.println((price <= 12 && rating == 5?"I'm intrested in watching the movie":"I'm not intrested in watching the movie"));
		sc.close();
		
	}
}
