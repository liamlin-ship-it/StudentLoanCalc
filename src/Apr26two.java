import java.util.Scanner;

public class Apr26two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(result(arr));
    }

    public static int result(int[] arr){
        int max = 0;
        for (int index : arr){
            if (index > max){
                max = index;
            }
        }

        return max;
    }
}
