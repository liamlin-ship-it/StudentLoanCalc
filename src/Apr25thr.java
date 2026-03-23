import java.util.Scanner;

public class Apr25thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("%.2f", calculate(n));
    }

    public static double calculate(int n){
        return n * n * 3.14;
    }
}
