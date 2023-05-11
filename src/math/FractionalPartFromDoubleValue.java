package math;

public class FractionalPartFromDoubleValue {
    public static void main(String[] args) {
        double x = 12.345;
        double fractional = x % 1;
        double integral = x - fractional;
        System.out.println("Original number: " + x);
        System.out.println("Fractional number: " + fractional);
        System.out.println("Integral number: " + integral);
    }
}