package clasroomProjects;

public class chicken01 {

	public static void main(String[] args) {
		int chickenCount = 3;
		int eggsPerChicken = 5;
		chickenCount = 8;
		eggsPerChicken = 4;
		int chickenMon = chickenCount;
		int chickenTue = chickenMon + 1;
		int chickenWed = chickenTue / 2;
		int monday = chickenMon * eggsPerChicken;
		int tuesday = chickenTue * eggsPerChicken;
		int wednesday = chickenWed * eggsPerChicken;
		int total = monday + tuesday + wednesday ;
		System.out.println("Farmer Brown had " + monday + " eggs in monday");
		System.out.println("Farmer Brown had " + tuesday + " eggs in tuesday");
		System.out.println("Farmer Brown had " + wednesday + " eggs in wednesday");
		System.out.println("Farmer Brown had a total of " + total + " eggs till the date");

		
	}

}
