
public class question01 {

	public static void main(String[] args) {
		//given
		double oneLitre = 160.90;
		double distancePerDay = 11.5*2;
		double mileage = 30;
		
		//calculation
		double mileagePerDay = mileage / distancePerDay;
		double pricePerDay = oneLitre / mileagePerDay;
		
		double totalDays = 30;
		double holiday = 5;
		double collegeDays = totalDays - holiday ;
		
		//question number a
		double totalExpense = pricePerDay * collegeDays ;
		System.out.println("the total expense of David on petrol is: Rs " + totalExpense);
		
		//question number b
		double incresedPrice = 200;
		double increasedPricePerDay = incresedPrice / mileagePerDay;
		double increasedExpense = increasedPricePerDay * collegeDays;
		System.out.println("The total expense of David if the petrol is increased to 200 will be Rs "+ increasedExpense);
		
		//question number c
		double decreasedDistance = 10*2;
		double newMileagePerDay = mileage / decreasedDistance;
		double newPricePerDay = incresedPrice / newMileagePerDay;
		double newExpense = newPricePerDay * collegeDays;
		System.out.println("The total expense of David if distance is 10km will be Rs " + newExpense);
		
		
	}
	

}
