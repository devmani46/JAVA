
public class arrays {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] bike = {"sports","Dirt","naked"};
		
		System.out.println(bike[0]);
		System.out.println(bike[1]);
		System.out.println(bike[2]);
		
		
		
		String[] cars = new String[6];
		cars[0]= "Tesla";
		cars[1]="Hundai";
		cars[2]="BMW";
		cars[3]="Mercedes";
		cars[4]="Mustang";
		cars[5]="Cadillac";
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}

		int[] marks = {1,3,15,4,51,2};
		for(int mark:marks) {
			System.out.println(mark);
		}
		

	}

}
