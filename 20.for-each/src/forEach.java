import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		// for each = traversing technique to iterate through the elements in an array/collection
		// 				less steps, more reliable
		//				less flexible
		
		
//		String[] animals = {"cat","dog","cow"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("cow");
		for(String i: animals) {
			System.out.println(i);
		}
	}
}
