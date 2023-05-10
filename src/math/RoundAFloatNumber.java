package math;

import java.math.BigDecimal;

public class RoundAFloatNumber {
    public static void main(String[] args) {
        float x = 123.456789123f;
        BigDecimal result;
        int decimal_place = 5;
        BigDecimal number = new BigDecimal(Float.toString(x));
        number = number.setScale(decimal_place, BigDecimal.ROUND_HALF_UP);

        System.out.printf("Original number: %.7f\n",x);
        System.out.println("Rounded up to 5 decimal: " + number);
    }
}