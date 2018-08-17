import java.util.Scanner;

public class The_Ratio_of_Product_to_the_Sum {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        double sum = n % 10;
        double multi = n % 10;
        while (n >= 10) {
            n /= 10;
            sum += n % 10;
            multi *= n % 10;
        }
        multi /= sum;
        System.out.printf("%.3f", multi);
    }
}
