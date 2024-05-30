package book.exercise.chapter03;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = a * d - b * c;

        if (x == 0) {
            System.out.println("the equation has no solution");
        } else {
            double t1 = e * d - b * f;
            double t2 = a * f - e * c;
            double x1 = t1 / x, x2 = t2 / x;

            System.out.println("x is " + x1 + " and y is " + x2);
        }
    }
}
