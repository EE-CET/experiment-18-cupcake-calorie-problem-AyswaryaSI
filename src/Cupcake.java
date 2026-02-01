import java.util.Arrays;
import java.util.Scanner;
public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }
        Arrays.sort(calories);

        long totalMiles = 0;
        long power = 1;
        for (int i = n - 1; i >= 0; i--) {
            totalMiles += calories[i] * power;
            power *= 2;
        }

        System.out.println(totalMiles);
        sc.close();
    }
}
