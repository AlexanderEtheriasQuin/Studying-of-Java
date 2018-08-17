import java.util.Scanner;
import java.math.BigInteger;

public class Ones {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger a1;
        BigInteger a2 = new BigInteger("1");
        BigInteger a3 = new BigInteger("2");
        BigInteger c = new BigInteger("0");
        int b;
        int counter = 0;
        while (n != BigInteger.ZERO) {
            a1 = n.mod(a3);
            n = n.divide(a3);
            a1 = a1.multiply(a2);
            c = c.add(a1);
            a2 = a2.multiply(BigInteger.TEN);
        }
        while (c != BigInteger.ZERO) {
            a1 = c.mod(BigInteger.TEN);
            b = a1.compareTo(BigInteger.ONE);
            c = c.divide(BigInteger.TEN);;
            if (b == 0) {
               counter++;
            }
        }
        System.out.print(counter);
    }
}
