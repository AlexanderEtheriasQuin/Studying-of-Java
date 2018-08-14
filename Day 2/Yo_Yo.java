import java.util.Scanner;

public class Yo_Yo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double l = in.nextInt();
        double k = in.nextInt();
        int counter = 0;
        l /= k;
        while (l > 1.000001) {
            l /= k;
            counter++;
        }
        System.out.print(counter);
    }
}
