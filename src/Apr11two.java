import java.util.Scanner;

public class Apr11two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i =0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int endNum = scanner.nextInt();

        System.out.println(yourFunc(arr, endNum));
    }

    public static String yourFunc(int[] arr, int endNum){
        StringBuilder sb = new StringBuilder();

        for (int result : arr){
            sb.append(result > endNum).append(" ");
        }
        return sb.toString();
    }
}
