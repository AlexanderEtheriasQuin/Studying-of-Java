import java.util.Scanner;

public class Transformation {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                counter++;
            }
            else {
                n++;
                counter++;
            }
        }
        System.out.print(counter);
    }
}
