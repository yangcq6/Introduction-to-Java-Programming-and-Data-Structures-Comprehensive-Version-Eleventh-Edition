package book.exercise.chapter02;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int a = number % 10;
        number /= 10;

        int b = number % 10;
        number /= 10;

        int c = number;

        int sum = a + b + c;
        System.out.printf("%d-%d-%d\n", a, b, c);
        System.out.println("The sum of the digits is " + sum);
    }
}
