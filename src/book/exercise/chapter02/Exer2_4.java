package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double numberOfPounds = input.nextDouble();

        double res = numberOfPounds * 0.454;
        System.out.println(numberOfPounds + " pounds is " + res + " kilograms");
    }
}
