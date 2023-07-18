import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			}
		//do loop
//		do {
//			System.out.print("Enter your name: ");
//			name = scj.nextLine();
//		}while(name.isBlank()); 
		
		System.out.println("Hello "+name);
		
		
		int a = 1;
		while(a<10) {
			a++;
			System.out.println(a);
		}
	sc.close();
	}

}
