package enums.computation;

public class ComputationTester {
    public static void main(String[] args) {
        double x = 7.0;
        double y = 4.4;

        System.out.println("Add: " + Computation.ADD.perform(x,y));
        System.out.println("Subtract: " + Computation.SUBTRACT.perform(x,y));
        System.out.println("Multiply: " + Computation.MULTIPLY.perform(x,y));
        System.out.println("Divide: " + Computation.DIVIDE.perform(x,y));

    }
}