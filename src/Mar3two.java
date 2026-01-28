import java.util.Scanner;

public class Mar3two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 != 0){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (i == j || i + j == n - 1){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else {
            System.out.println(n + " is not an odd number.");
        }
    }
}
