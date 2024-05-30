package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double res = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + res + " Fahrenheit");
    }
}
