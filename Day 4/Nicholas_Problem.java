import java.util.Scanner;

public class Nicholas_Problem {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long answer = 1;
        if (n >= m) {
            answer = 0;
        }
        else {
            for (long i = 2; i <= n; i++) {
                answer = (answer * i) % m;
            }
        }
        System.out.print(answer);
    }
}
