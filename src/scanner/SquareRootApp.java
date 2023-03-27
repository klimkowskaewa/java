package scanner;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {

        double number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the square root: ");
        number = sc.nextDouble();

        double square = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + square);

    }
}
