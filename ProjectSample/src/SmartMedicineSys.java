
import java.util.Scanner;

public class SmartMedicineSys {

    static String medicineName;
    static int medicineQuantity;
    static double medicinePrice;
    static int totalMedicineCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of medicine you want to buy : ");
        totalMedicineCount = sc.nextInt();

        for (int i = 1; i <= totalMedicineCount; i++) {
            sc.nextLine();
            System.out.println("Enter medicine name : " + i);
            medicineName = sc.nextLine();
            System.out.println("Enter medicine quantity : ");
            medicineQuantity = sc.nextInt();
            System.out.println("Enter medicine price : ");
            medicinePrice = sc.nextDouble();
            DiscountedMedicine.calculateTotalAmount(medicineName, medicineQuantity, medicinePrice, totalMedicineCount);
        }
    }

}