package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int year = input.nextInt();

        double res = investAmount * Math.pow((1 + 4.25 / 1200), year * 12);
        System.out.println("Future value is $" + res);
    }
}
