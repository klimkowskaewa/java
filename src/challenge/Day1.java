package challenge;

/**
 * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
 * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli.
 * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie kokardkę na choinkę.
 * Jeżeli potrafisz, nie wpisuj kokardki bezpośrednio w printy - pokombinuj z pętlami.
 * Tak, żeby kokardka wygenerowała się sama!
 */

public class Day1 {

    public static void main(String[] args) {
        int height = 10;
        createABow(height);
    }

    private static void createABow(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || j == i || j == height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}