package book.exercise.chapter03;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 +
                    " and " + r2);
        } else if (delta == 0) {
            double r = (-b + Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("The equation has one root " + r);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
