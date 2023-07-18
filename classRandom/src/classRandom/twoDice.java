package classRandom;

import java.util.Random;

public class twoDice {

	public static void main(String[] args) {
		
		Random randomName = new Random();
		int x = randomName.nextInt(6)+1;
		int y = randomName.nextInt(6)+1;
		int sum = x + y;
		System.out.println("sum of two dice is "+sum);
		
	}
}
