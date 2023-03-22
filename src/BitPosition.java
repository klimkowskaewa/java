public class BitPosition {
    public static void main(String[] args) {
        int i = 5;
        int n = 2;
        int mask = 1 << n - 1;
        boolean result = ( i & mask) > 0;

        System.out.println();
        System.out.println("For the number " + i + " in the " + n + " position there is a bit: "+ result);
        System.out.println();
        System.out.println(String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(i & mask)).replace(' ', '0'));

    }

}