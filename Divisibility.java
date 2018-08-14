import java.util.Scanner;

public class Divisibility {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % b != 0) {
            System.out.print(a/b + " " + a % b);
        }
        else {
            System.out.print("Divisible");
        }
    }
}
