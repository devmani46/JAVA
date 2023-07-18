package classroomRandom;

import java.util.Random;

public class q1 {

	public static void main(String[] args) {
		
		Random randomName = new Random();
		int x = randomName.nextInt(1)+1;
		
		if (x == 1) {
			System.out.println("Heads");
		}
		else {
			System.out.println("tails");
		}
	
		
	}
}
