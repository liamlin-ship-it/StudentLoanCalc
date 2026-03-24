import java.util.Scanner;

public class Apr26one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.printf("%.2f", calculate(arr));
    }

    public static double calculate(int[] arr){
        double sum = 0;
        for (int index : arr){
            sum += index;
        }

        return sum / arr.length;
    }
}
