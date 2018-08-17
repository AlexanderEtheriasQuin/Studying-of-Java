import java.util.Scanner;

public class The_Arithmetic_Mean_of_Positive {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double array[] = new double [n];
        double sum = 0;
        int amount = n;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextDouble();
        }
        for (int j = 0; j < n; j++) {
            if (array[j] > 0) {
                sum += array[j];
            }
            else {
                amount--;
            }
        }
        if (amount == 0) {
            System.out.print("Not Found");
        }
        else {
            sum /= amount;
            System.out.printf("%.2f", sum);
        }
    }
}
