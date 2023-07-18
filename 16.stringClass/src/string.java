
public class string {
	public static void main(String[] args) {
		
		// String is a reference data type that can store one or more characters
		String name = "Dev Mani";
		//.equals
		boolean result = name.equals("dev mani");
		System.out.println(result);
		//.equalsIgnoreCase
		boolean result1 = name.equalsIgnoreCase("dev mani");
		System.out.println(result1);
		//.length
		int length = name.length();
		System.out.println(length);
		
		//.charAt
		char charAt = name.charAt(0);
		System.out.println(charAt);
		
		//.indexOf
		int index = name.indexOf("v");
		System.out.println(index);
		
		//lower/upper
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		//trimming space
		String a = "     asdasd   ";
		System.out.println(a.trim());
		
		//.replace
		String replace = name.replace("e", "a");
		System.out.println(replace);
	}

}
