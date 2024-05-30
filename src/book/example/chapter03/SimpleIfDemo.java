package book.example.chapter03;

import java.util.Scanner;

/**
 * 2024/05/30
 *
 * @author yangcq6
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");

    }
}
