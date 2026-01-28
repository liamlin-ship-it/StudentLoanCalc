import java.util.Scanner;

public class Mar7two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[10];
        while (true){
            int n = scanner.nextInt();
            if (n < 0) break;
            counts[n]++;   //紀錄每個數字出現的次數
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Number " + i + " appears " + counts[i] +  " time(s)");
        }
    }
}
