import java.util.Scanner;

public class Smooth_Divisors {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 2;
        int counter = 0;
        while (m <= n) {
            if (n/m == n % m) {
                counter++;
            }
            m++;
        }
        System.out.print(counter);
    }
}
