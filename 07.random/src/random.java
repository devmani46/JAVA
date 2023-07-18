import java.util.Random;

public class random {

	public static void main(String[] args) {
		
		Random randomName = new Random();
		int x = randomName.nextInt(6)+1;
//		int x = randomName.nextInt(1,6+1);
//		double x = randomName.nextInt();
//		boolean x = randomName.nextInt();
		
		System.out.println("Random number is:"+x);
		
	}
}
