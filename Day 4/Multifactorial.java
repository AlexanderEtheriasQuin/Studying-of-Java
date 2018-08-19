import java.util.Scanner;

public class Multifactorial {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long k = in.nextInt();
        long answer = 1;
        boolean point = false;
        for (; n > 0; n-=k) {
            if (1e18 / n < answer) {
                point = true;
                break;
            }
            answer *= n;
        }
        if (point) {
            System.out.print("overflow");
        }
        else {
            System.out.print(answer);
        }
    }
}


