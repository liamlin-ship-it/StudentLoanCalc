import java.util.Scanner;

public class BetterMar21thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right){
            int width = right - left;   //先算寬度

            int height = Math.min(num[left], num[right]);
            //再比較高度

            int currentArea = width * height;   //比較面積
            if (currentArea > maxArea){
                maxArea = currentArea;
            }

            if (num[left] < num[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
