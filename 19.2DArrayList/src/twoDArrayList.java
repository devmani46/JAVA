import java.util.*;
public class twoDArrayList {

	public static void main(String[] args) {
		// 2D ArrayList = a dynamic list of list
		// can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> allList = new ArrayList();
	
		ArrayList<String> bl = new ArrayList();
		bl.add("pasta");
		bl.add("tea");
		bl.add("donuts");
		bl.add("breads");
		
		ArrayList<String> pl = new ArrayList();
		pl.add("salt");
		pl.add("sugar");
		pl.add("cream");
		pl.add("jam");
		
		ArrayList<String> dl = new ArrayList();
		dl.add("coffee");
		dl.add("fanta");

		allList.add(bl);
		allList.add(pl);
		allList.add(dl);
		
		System.out.println(allList);
		System.out.println(allList.get(0));
		System.out.println(allList.get(0).get(1));
		
	}

}
