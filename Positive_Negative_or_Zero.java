import java.util.Scanner;

public class Positive_Negative_or_Zero {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            System.out.print("Positive");
        }
        else if (n == 0) {
            System.out.print("Zero");
        }
        else {
            System.out.print("Negative");
        }
    }
}
