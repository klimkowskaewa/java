package ageTester;

public class AgeTester {
    public static void main(String[] args) {
        try {
            checkAge(55);
        } catch (AgeRangeException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }

    public static void checkAge(int age){
        if (age<18){
            throw new AgeRangeException("Attention! You have no access.");
        } else {
            System.out.println("Access granted...");
        }
    }
}
