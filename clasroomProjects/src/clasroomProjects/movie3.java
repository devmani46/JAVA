package clasroomProjects;

import java.util.Scanner;

public class movie3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter movie price: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter movie rating: ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter movie genre: ");
		String genre1 = sc.nextLine();
		String genre = genre1.toLowerCase();
		
		if((price<=12 && rate ==5 && genre.equals("action")) || (price<=20 && genre.equals("sci-fi"))) {
			System.out.println("I'm intrested in watching the movie");
		}
		else {
			System.out.println("I'm not intrested in watching the movie");
		}
	sc.close();
	}

}
