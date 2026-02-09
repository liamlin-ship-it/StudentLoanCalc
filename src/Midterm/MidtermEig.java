package Midterm;

import java.util.Scanner;

public class MidtermEig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        double floating = scanner.nextDouble();

        String result = checkThreshold(integer, floating);

        System.out.println(result);

        scanner.close();
    }

    public static String checkThreshold(int integer, double floating) {
        return ((integer + floating) > 59.5) ? "Pass" : "Fail";
    }
}
