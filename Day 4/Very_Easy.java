import java.util.Scanner;

public class Very_Easy {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long a = in.nextInt();
        long sum = 0;
        long multi = 1;
        if (a == 1) {
            sum = n*(n + 1)/2;
        }
        else {
            for (int i = 1; i <= n; i++) {
                multi *= a;
                sum += i * multi;
            }
        }
        System.out.print(sum);
    }
}