import java.util.Scanner;

public class Feb23one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println(n + " is not an odd number.");
        }else {
            int height = n / 2 + 1;
            for (int i = 1; i <= height; i++){
                System.out.println(" ".repeat(height - i) + "A".repeat(i * 2 - 1));
            }
            System.out.println();
        }
    }
}
