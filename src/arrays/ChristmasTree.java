package arrays;

import java.util.Random;

public class ChristmasTree {
    public static void main(String[] args) {

        int height = 18;
        char[] signsElements = {'+', ',', '.', '*', '~', '^', 'o'};
        Random random = new Random();
        char signs;
        int signsNumber = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++) {
                signs = signsElements[random.nextInt(signsElements.length)];
                System.out.print(signs);
            }
            signsNumber = signsNumber + 2; // signsNumber += 2
            System.out.println("");
        }
    }
}
