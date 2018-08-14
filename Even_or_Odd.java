import java.util.Scanner;

public class Even_or_Odd {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.print("EVEN");
        }
        else {
            System.out.print("ODD");
        }
    }
}
