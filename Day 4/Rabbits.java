import java.util.Scanner;

public class Rabbits {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long counter = 1;
        if (n == 0) {
            System.out.print(counter);
        }
        else {
            for (int i = 0; i < n; i++) {
                if (counter > k) {
                    counter -= k;
                }
                counter *= 2;
            }
            System.out.print(counter);
        }
    }
}
