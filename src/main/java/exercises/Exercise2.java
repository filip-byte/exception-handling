package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {

        int[] input = new int[2];

        Scanner scanner = new Scanner(System.in);

        while (true) {


            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                input[0] = divisor;

                System.out.print("Enter dividend: ");

                int dividend = scanner.nextInt();
                input[1] = dividend;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
                continue;
            }
            return input;





        }

    }
}