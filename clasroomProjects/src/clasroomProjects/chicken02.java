package clasroomProjects;

public class chicken02 {

	public static void main(String[] args) {
		double chickenMon = 100;
		double chickenTue = 121;
		double chickenWed = 117;
		double chickenAvg = (chickenMon + chickenTue + chickenWed)/3;
		System.out.println("Farmer Fred collected the average of " + chickenAvg + " eggs daily");
		double monthAvg = 30 * chickenAvg;
		System.out.println("Farmer Fred collected the average of " + monthAvg + " eggs monthly");
		double profit = 0.18;
		double monthlyProfit = profit * monthAvg;
		System.out.println("Farmer Fred gains the total profit of " + monthlyProfit + "$ monthly");
	}

}
