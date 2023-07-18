
public class twoD {

	public static void main(String[] args) {
		String[][]cars = new String[3][3];
		cars[0][0]="Tesla";
		cars[0][1]="Tesla2";
		cars[0][2]="Tesla3";
		
		cars[1][0]="Farrari";
		cars[1][1]="Farrai2";
		cars[1][2]="Farrari3";
		
		cars[2][0]="Lambo";
		cars[2][1]="Lambo2";
		cars[2][2]="Lambo3";
		
		for(int i=0; i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}

}
