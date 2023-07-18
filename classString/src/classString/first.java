package classString;

public class first {

	public static void main(String[] args) {
//		/*
		String name = "hellooooooo";
		System.out.println(name.length()); // gives the length of the value
		System.out.println(name.toUpperCase());	// converts the value in uppercase
//		System.out.println(name.contains(name)); 
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(5));
//		*/
		
		/*
		String num = "98-456-22";
		int indx1 =num.indexOf("-");
		System.out.println("index of first dash: "+indx1);
		int indx2 = num.indexOf("-", indx1 + 1);
		System.out.println("index of second dash: "+indx2);
		*/
		
		//sub string
		
		String greeting = "hello, world";
		String sub = greeting.substring(1,8);
		System.out.println(sub);
		String w = greeting.substring(0,8);
		System.out.println(w);
		
		//replace
		String replace = greeting.replace("l", "1");
		System.out.println(replace);
	}

}
