package Midterm;

import java.util.Scanner;

public class MidtermTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        String[] result = intToEvenOddStrings(numbers);

        for (String ans : result){
            System.out.print(ans + "　");
        }

        scanner.close();
    }

    public static String[] intToEvenOddStrings(int[] numbers) {
        String[] ans = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                ans[i] = "Even";
            }else {
                ans[i] = "Odd";
            }
        }
        return ans;
    }
}
