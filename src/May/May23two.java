package May;

import java.util.Scanner;

public class May23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        long nCase = 1;
        long xCase = 1;
        long nxCase = 1;

        for (long i = n; i > 0; i--) {
            nCase *= i;
        }

        for (long i = x; i > 0; i--) {
            xCase *= i;
        }

        for (long i = (n - x); i > 0; i--) {
            nxCase *= i;
        }

        System.out.println(nCase / (nxCase * xCase));
    }
}
