import java.util.Scanner;

public class Mar15two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double root = Math.round(Math.sqrt(n));
        double square = Math.pow(root, 2);

        System.out.println("x:" + (int) square + " distance:" + (int) (square - n));
    }
}
