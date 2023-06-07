package math;

import java.util.Scanner;

public class MetersToInches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a value for meters: ");
        double x = input.nextDouble();
        double inches = x / 0.0254;
        System.out.println(x + " meters is " + inches + " inches.");
    }
}
