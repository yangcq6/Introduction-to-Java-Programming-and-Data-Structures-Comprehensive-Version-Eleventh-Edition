package book.exercise.chapter03;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class Exer3_2 {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 +
                " + " + number3 + "? ");

        int answer = input.nextInt();

        if (answer == (number1 + number2 + number3)) {
            System.out.println("right");
        } else {
            System.out.println("error");
        }
    }
}
