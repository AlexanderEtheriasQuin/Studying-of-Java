import java.util.Scanner;

public class Conditional_statement_2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextInt();
        long y;
        if (x < 10) {
            y = x*x - 2*x + 4;
        }
        else {
            y = x*x*x + 5*x;
        }
        System.out.print(y);
    }
}
