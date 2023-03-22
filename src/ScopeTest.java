public class ScopeTest {
    int test = 10;

    void printTest() {
        System.out.println("Test: " + this.test);
        int test = 33;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        ScopeTest sc = new ScopeTest();
        sc.printTest();
    }
}
