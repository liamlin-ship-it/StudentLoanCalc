package May;

import java.util.Scanner;

public class BetterMay23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        System.out.println(calculate(n, x));
    }

    public static long calculate(int n, int x){
        if (x > n) return 0;
        // make the loop run as few times as possible
        if (x > n / 2) x = n - x;

        long result = 1;
        for (int i = 1; i <= x; i++) {
            // multiply then divide to maintain precision and delay overflow
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
