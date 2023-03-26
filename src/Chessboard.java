import java.math.BigInteger;

public class Chessboard {
    public static void main(String[] args) {
        int numSquares = 64;
        {
            BigInteger num = new BigInteger("2");
            for (int i = 1; i <= numSquares; i++)
            {
                System.out.print("chess field " + i + ": ");
                System.out.printf( " %,d", num);
                System.out.println();
                num = num.multiply(new BigInteger("2"));
            }
        }
    }
}