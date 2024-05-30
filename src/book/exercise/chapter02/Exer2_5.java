package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = subtotal * rate / 100;
        double sum = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + sum);
    }
}
