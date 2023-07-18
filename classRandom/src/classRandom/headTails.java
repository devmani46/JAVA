package classRandom;

import java.util.Random;

public class headTails {

	public static void main(String[] args) {
		
		Random randomName = new Random();
		int x = randomName.nextInt(2)+1;
		
		if (x == 1) {
			System.out.println("Heads");
		}
		else {
			System.out.println("tails");
		}
	
		
	}
}
