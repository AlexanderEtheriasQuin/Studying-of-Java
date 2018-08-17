import java.util.Scanner;

public class Soda_Surplier {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int f = in.nextInt();
        int c = in.nextInt();
        int s = e + f;
        int counter = 0;
        while (s >= c) {
            s -= c;
            s++;
            counter++;
        }
        System.out.print(counter);
    }
}
