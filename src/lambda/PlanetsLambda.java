package lambda;

import java.util.Arrays;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 1));
        Arrays.asList(planets).forEach(s -> System.out.println(s));
    }
}