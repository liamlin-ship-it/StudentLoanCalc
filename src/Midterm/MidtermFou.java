package Midterm;

import java.util.Scanner;

public class MidtermFou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        int result = countTargetNumber(numbers, target);

        System.out.println(result);

        scanner.close();
    }

    public static int countTargetNumber(int[] numbers, int target) {
        int count = 0;

        for (int current : numbers){
            if (current == target){
                count++;
            }
        }
        return count;
    }
}
