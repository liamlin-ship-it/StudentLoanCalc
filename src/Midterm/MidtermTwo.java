package Midterm;

import java.util.Scanner;

public class MidtermTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] values = new String[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            values[i] = flip(values[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(values[i] + " ");
        }

        scanner.close();
    }

    public static String flip(String input) {
        return input.equals("True") ? "False" : "True";
    }
}
