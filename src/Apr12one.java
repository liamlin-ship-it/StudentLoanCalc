import java.util.Scanner;

public class Apr12one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        System.out.println(target + " has " + Count(nums, target));
    }

    public static int Count(int[] nums, int target){
        int count = 0;
        for (int num : nums){
            if (num == target){
                count++;
            }
        }
        return count;
    }
}
