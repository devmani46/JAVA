import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Mo:Mo");
		food.add("Burger");
		food.add("Pizza");
		food.add("HotDog");
		
		food.set(0, "sushi");//replace
		food.remove(3);//to remove
//		food.clear();		//clears everything
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
