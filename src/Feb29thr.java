import java.util.Scanner;

public class Feb29thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        String str = String.valueOf(sum);

        String result = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(result));
    }
}
