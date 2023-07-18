
public class question03 {

	public static void main(String[] args) {
		String iBook = "i.A Game of Thrones";
		String iiBook = "ii. Harry Potter and The Philosopher's Stone";
		String iiiBook = "iii. Invisible Man";
		double aBook = 200;
		double bBook = 250;
		double cBook = 300;
		
		
		//in January;
		double aBookJan= aBook;
		//2c in January 
		double aBookJan2 = aBook;
		double bBookJan2 = bBook;
		double cBookJan2 = cBook;
		
		//in February;
		double aBookFeb = aBook + (aBook*0.05);
		double bBookFeb = bBook;
		double cBookFeb = cBook;
		//2c in February
		double aBookFeb2 = aBook + (aBook*0.05);
		double bBookFeb2 = bBook + (bBook*0.05);
		double cBookFeb2 = cBook + (cBook*0.05);
		
		
		//in March;
		double aBookMar= aBook + (aBook*0.1);
		double bBookMar = bBook + (bBook*0.05);
		double cBookMar = cBook + (cBook*0.05);
		//2c in march
		double aBookMar2= aBook + (aBook*0.1);
		double bBookMar2 = bBook + (bBook*0.1);
		double cBookMar2 = cBook + (cBook*0.1);
		
		
		
		//in April;
		double aBookApr= aBook + (aBook*0.15);
		double bBookApr = bBook + (bBook*0.1);
		double cBookApr = cBook + (cBook*0.1);
		//2c in April
		double aBookApr2= aBook + (aBook*0.15);
		double bBookApr2 = bBook + (bBook*0.15);
		double cBookApr2 = cBook + (cBook*0.15);
		
		//in May;
		double aBookMay= aBook + (aBook*0.2);
		double bBookMay = bBook + (bBook*0.15);
		double cBookMay = cBook + (cBook*0.15);
		//2c in May;
		double aBookMay2= aBook + (aBook*0.2);
		double bBookMay2 = bBook + (bBook*0.2);
		double cBookMay2 = cBook + (cBook*0.2);
		
		
		//in June;
		double aBookJune= aBook + (aBook*0.25);
		double bBookJune = bBook + (bBook*0.2);
		double cBookJune = cBook + (cBook*0.2);
		//2c in June;
		double aBookJune2= aBook + (aBook*0.25);
		double bBookJune2 = bBook + (bBook*0.25);
		double cBookJune2 = cBook + (cBook*0.25);
		
		
		//in July;
		double aBookJuly= aBook + (aBook*0.3);
		double bBookJuly = bBook + (bBook*0.25);
		double cBookJuly = cBook + (cBook*0.25);
		//2c in July;
		double aBookJuly2= aBook + (aBook*0.3);
		double bBookJuly2 = bBook + (bBook*0.3);
		double cBookJuly2 = cBook + (cBook*0.3);
		
		//in August;
		double cBookAug = cBook + (cBook*0.3);
		//2c in August;
		double aBookAug2= aBook + (aBook*0.35);
		double bBookAug2 = bBook + (bBook*0.35);
		double cBookAug2 = cBook + (cBook*0.35);
		
		//2c in September;
		double aBookSep2= aBook + (aBook*0.4);
		double bBookSep2 = bBook + (bBook*0.4);
		double cBookSep2 = cBook + (cBook*0.4);
		
		//2c in October;
		double aBookOct2= aBook + (aBook*0.45);
		double bBookOct2 = bBook + (bBook*0.45);
		double cBookOct2 = cBook + (cBook*0.45);
		
		//2c in November;
		double aBookNov2= aBook + (aBook*0.5);
		double bBookNov2 = bBook + (bBook*0.5);
		double cBookNov2 = cBook + (cBook*0.5);
		
		
		
		
		double aBookPrice = aBookJan + aBookFeb + aBookMar + aBookApr + aBookMay+aBookJune+aBookJuly;
		double bBookPrice = bBookFeb + bBookMar + bBookApr + bBookMay+bBookJune+bBookJuly;
		double cBookPrice = cBookFeb + cBookMar + cBookApr + cBookMay+cBookJune+cBookJuly;
		System.out.println("In July, For for "+iBook+", Sita needs to pay total of Rs " + aBookPrice);
		System.out.println("In July, For for "+iiBook+", Sita needs to pay total of Rs " + bBookPrice);
		System.out.println("In July, For for "+iiiBook+", Sita needs to pay total of Rs " + cBookPrice);
		System.out.println("Sita needs to pay a total of Rs " + (aBookPrice+ bBookPrice + cBookPrice));
		
		System.out.println();
		System.out.println();
		
		//question b
		double aBookMarB = aBookJan + aBookFeb + aBookMar;
		double bBookJulyB = bBookFeb + bBookMar + bBookApr + bBookMay+bBookJune+bBookJuly;
		double cBookAugB = cBookFeb + cBookMar + cBookApr + cBookMay+cBookJune+cBookJuly+cBookAug;
		
		System.out.println("In March, For for "+iBook+", Sita needs to pay total of Rs " + aBookMarB);
		System.out.println("In July, For for "+iiBook+", Sita needs to pay total of Rs " + bBookJulyB);
		System.out.println("In August, For for "+iiiBook+", Sita needs to pay total of Rs " + cBookAugB);
		System.out.println("Sita needs to pay a total of Rs " + (aBookMarB+ bBookJulyB + cBookAugB));
		
		System.out.println();
		System.out.println();
		
		//question c;
		double aBookDecC = aBookJan2 + aBookFeb2 + aBookMar2 + aBookApr2 + aBookMay2 + aBookJune2 + aBookJuly2 + aBookAug2 + aBookSep2 + aBookOct2 + aBookNov2;
		double bBookDecC = bBookJan2 + bBookFeb2 + bBookMar2 + bBookApr2 + bBookMay2 + bBookJune2 + bBookJuly2 + bBookAug2 +bBookSep2 + bBookOct2 + bBookNov2;
		double cBookDecC = cBookJan2 + cBookFeb2 + cBookMar2 + cBookApr2 + cBookMay2 + cBookJune2 + cBookJuly2 + cBookAug2 +cBookSep2 + cBookOct2 + cBookNov2;
		System.out.println("In December, For "+iBook+", Sita needs to pay total of Rs " + aBookDecC);
		System.out.println("In December, For "+iiBook+", Sita needs to pay total of Rs " + bBookDecC);
		System.out.println("In December, For  "+iiiBook+", Sita needs to pay total of Rs " + cBookDecC);
		System.out.println("Sita needs to pay a total of Rs " + (aBookDecC+ bBookDecC + cBookDecC));
	}

}