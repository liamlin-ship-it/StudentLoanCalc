import java.util.Scanner;

public class Apr25one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(calculate(n));
    }

    public static int calculate(int n){
        return n * n;
    }
}
