package accessmodifier.visitCounterTester;

public class VisitCounterTester {
    public static void main(String[] args) {

        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
        System.out.println(visitCounter.getCounter());
    }

}