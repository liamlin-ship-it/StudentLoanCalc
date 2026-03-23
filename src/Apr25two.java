import java.util.Scanner;

public class Apr25two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%.2f", calculate(n));
    }

    public static double calculate(int n){
        return Math.sqrt(3) / 4 * n * n;
    }
}
