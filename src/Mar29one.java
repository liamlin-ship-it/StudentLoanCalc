import java.util.Scanner;

public class Mar29one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(abs(n));
    }

    public static int abs(int a){
        return (a > 0) ? a : -a;
    }
}
