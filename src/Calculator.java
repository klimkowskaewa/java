//Napisz program Calculator.java, zawierający metody do sumowania, odejmowania i mnożenia dwóch
// liczb całkowitych. Zaprezentuj działanie każdej z metod.


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x =scanner.nextDouble();
        double y = scanner.nextDouble();

        showAddition(x,y);
        showSubstraction(x,y);
        showDivision(x,y);
        showMultiplication(x,y);
    }

    public static void showAddition(double x, double y) {
        System.out.println("Addition " + (x + y) );
    }

    public static void showSubstraction(double x, double y) {
        System.out.println("Substraction " + (x - y) );
    }

    public static void showMultiplication(double x, double y) {
        System.out.println("Multiplication " + (x * y) );
    }

    public static void showDivision(double x, double y) {
        System.out.println("Division " + (x / y) );
    }

}
