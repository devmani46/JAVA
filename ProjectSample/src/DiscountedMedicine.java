
public class DiscountedMedicine {

    static double totalPrice;
    static double discountRate;
    static double finalRate;

    public static void calculateTotalAmount(String name, double amount, double quantity, int medicineCount) {

        System.out.println("The " + name + " costs : Rs." + (amount * quantity));
        totalPrice = amount * quantity;
        discountCalculation(name, totalPrice, medicineCount);

    }

    public static void discountCalculation(String name, double total, int medicineCount) {
        discountRate = 0.13;
        finalRate = total - (discountRate * total);
        System.out.println("The final rate after discount is:  " + finalRate);
        ProfitLossCalculator.profitLossCalculator(name, finalRate, medicineCount);
    }
}
