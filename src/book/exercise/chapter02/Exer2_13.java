package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlyAmount = input.nextDouble();

        double oneMonth = monthlyAmount * (1 + 0.00417);
        double twoMonth = (monthlyAmount + oneMonth) * (1 + 0.00417);
        double threeMonth = (monthlyAmount + twoMonth) * (1 + 0.00417);
        double fourMonth = (monthlyAmount + threeMonth) * (1 + 0.00417);
        double fiveMonth = (monthlyAmount + fourMonth) * (1 + 0.00417);
        double sixMonth = (monthlyAmount + fiveMonth) * (1 + 0.00417);

        System.out.println("After the sixth month, the account value is $" + sixMonth);
    }
}
