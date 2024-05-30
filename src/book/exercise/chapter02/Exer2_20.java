package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate(e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double rate = input.nextDouble();

        double res = balance * (rate / 1200);
        System.out.println("The interest is " + res);
    }
}
