package exceptions;

import java.util.Scanner;

public class SqrtCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        System.out.println("Enter number: ");

        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("The given value is not a number!");
            System.exit(-1);
        } finally {
            System.out.println("The End.");
        }

        if (d<0) {
            throw new IllegalArgumentException();
        }

        System.out.println(Math.sqrt(d));
    }
}
