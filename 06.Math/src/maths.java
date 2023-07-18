
public class maths {

	public static void main(String[] args) {
		
		double a = 100;
		double b = 10;
		double c = 3.14;
		double d= 4.6;
		
		double max = Math.max(a, b);	//prints maximum value among given numbers
		double min = Math.min(a, b);	//prints minimum value among given numbers
		double round = Math.round(d);	//prints round off value among given number
		double sqrt = Math.sqrt(a);		//prints square root of given numbers
		double cbrt = Math.cbrt(125); 	// prints cuberot of given number
		double floor = Math.floor(c);	//prints lowest round off value of given number
		double ceil = Math.ceil(c);		//prints highest round off value of given number
		double power = Math.pow(b,2);	// power(base,exponential)
		double abs = Math.abs(-123);	// absolute value of given number
	
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(round);
		System.out.println(sqrt);
		System.out.println(cbrt);
		System.out.println(floor);
		System.out.println(ceil);
		System.out.println(power);
		System.out.println(abs);
		
	}

}
