import java.util.Scanner;

public class Mar29two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(sum(arr, n));
    }

    public static int sum(int[] arr, int n){
        int total = 0;
        for (int i = 0; i < n; i++){
            total += arr[i];
        }
        return total;
    }
}
