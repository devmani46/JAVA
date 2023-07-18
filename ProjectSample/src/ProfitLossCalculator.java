
import java.util.Scanner;

public class ProfitLossCalculator {

    static int totalItems;
    static double profitOrLossPrice = 0;
    static boolean isProfit = false;

    public static void profitLossCalculator(String name, double discountedFinalPrice, int medicineCount) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[medicineCount];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter the actual price of " + name + ": ");
            prices[i] = sc.nextInt();
        }
        for (int price : prices) {
            if (price > profitOrLossPrice) {
                isProfit = true;
                profitOrLossPrice = price - discountedFinalPrice;
            } else {
                isProfit = false;
                profitOrLossPrice = discountedFinalPrice - price;

            }
            finalCalculation(isProfit, profitOrLossPrice);

        }
    }

    public static void finalCalculation(boolean isProfit, double profitOrLossPrice) {
        if (isProfit) {
            System.out.println("It is a profit and the profit is Rs." + profitOrLossPrice);
        } else {
            System.out.println("It is a loss and the loss is Rs." + profitOrLossPrice);

        }
    }
}
