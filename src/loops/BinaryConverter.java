package loops;

public class BinaryConverter {
    public static void main(String[] args) {
        String binary = "1100101011";
        Long result = 0L;

        for (int i = 0; i < binary.length() ; i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            result += bit * (int) Math.pow(2, i);
        }

        System.out.println("Binary " + binary + " and " + result + " decimal.");
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(result));
    }
}