public class PrimeFinderTester {

    public static void main(String[] args) {

        try {
            PrimeFinder pf = new PrimeFinder(123);
            pf.run();
            System.out.println(pf.prime);

            System.out.print("Is prime?: ");
            System.out.println(pf.isPrime(12));
            System.out.print("Is prime?: ");
            System.out.println(pf.isPrime(29));
        } catch (NegativeNumberException e) {
            System.out.println("Negative number entered: " + e.getMessage());
        }
    }

}