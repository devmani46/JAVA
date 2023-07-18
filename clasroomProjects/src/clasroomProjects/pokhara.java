package clasroomProjects;

import java.util.Scanner;

public class pokhara {

	public static void main(String[] args) {
		Scanner placeScanner = new Scanner(System.in);
		System.out.print("Enter the place David wants to go: ");
		String placeA= placeScanner.nextLine();
		String place = placeA.toLowerCase();
		
		if(place.equals("pokhara")) {
			Scanner insidePokharaS = new Scanner(System.in);
			System.out.print("Where does david want to go inside pokhara? ");
			String insidePokhara1 = insidePokharaS.nextLine();		
			String insidePokhara = insidePokhara1.toLowerCase();
			
			if(insidePokhara.equals("phewa lake")) {
				System.out.println("David is planning to go boating");
			}
				else if (insidePokhara.equals("begnas lake")) {
					System.out.println("He is planning to go fishing");
				}

				else {
					System.out.println("Enter: either 'phewa lake' or 'begnas lake' ");
				}
			insidePokharaS.close();
		}
		else if (place.equals("chitwan")){
			System.out.println("David is enjoying his jungle safari in chitwan");
		}
		else {
			System.out.println("Enter: either 'pokhara' or 'chitwan' ");
		
		}

		
		placeScanner.close();
	}

}
