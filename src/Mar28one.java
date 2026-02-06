import java.util.Scanner;

public class Mar28one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(findMax(a, b));
    }

    public static int findMax(int a, int b){
        return Math.max(a, b);
    }
}
