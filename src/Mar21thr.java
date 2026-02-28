import java.util.Scanner;

public class Mar21thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }

        int maxArea = 0;

        for (int i = 0 ; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int height= Math.min(num[i], num[j]);   //高度是陣列內容
                int width = j - i;   //寬度是索引距離

                int currentArea = width * height;
                if (currentArea > maxArea){
                    maxArea = currentArea;
                }
            }
        }
        System.out.println(maxArea);
    }
}
