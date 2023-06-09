package lambda;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLambda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(3));

        Introducer introducer = name -> System.out.println("Cześć! Mam na imię " + name + ".");
        introducer.run("Agata");

        UnaryOperator<Integer> uo = o -> o * o;
        System.out.println(uo.apply(2));

        Consumer<String> consumer = s -> System.out.println("Cześć! Mam na imię " + s + ".");
        consumer.accept("Wojtek");
    }
}
@FunctionalInterface
interface Multiplier {
    int perform (int x);
}

@FunctionalInterface
interface  Introducer {
    void run(String name);
}