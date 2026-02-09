package Midterm;

import java.util.Scanner;

public class MidtermNin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int result = getSumInRange(array, start, end);

        System.out.println(result);

        scanner.close();
    }

    public static int getSumInRange(int[] array, int start, int end) {
        int sum = 0;

        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i < end; i++){
            sum += array[i];
        }
        return sum;
    }
}
