import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class The_three_multiply_n_plus_one_problem {
    public static int length (int n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n = n*3 + 1;
            }
            length++;
        }
        return length;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j;
        while (in.hasNext()) {
            i = in.nextInt();
            j = in.nextInt();
            int length, maxlength = 0;
            for (int n = min(i,j); n <= max(i,j); n++) {
                length = length(n);
                if (length > maxlength) {
                    maxlength = length;
                }
            }
            System.out.println(i + " " + j + " " + maxlength);
        }
    }
}
