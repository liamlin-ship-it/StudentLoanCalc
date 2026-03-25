package May;

import java.util.Scanner;

class Work {
    public int ReturnMax(int[] n){
        int max = n[0];
        for (int index : n){
            if (index > max){
                max = index;
            }
        }
        return max;
    }

    public int ReturnMin(int[] n){
        int min = n[0];
        for (int index : n){
            if (index < min){
                min = index;
            }
        }
        return min;
    }

    // StringBuilder is like a mutable (changeable) string.
    // It lets us add to it without creating new objects in memory!
    public String Reverse(int[] n){
        StringBuilder result = new StringBuilder();
        for (int i = n.length - 1; i >= 0; i--){
            result.append(n[i]).append(" ");
        }
        return result.toString();
    }
}

public class BetterMay2two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Work work = new Work();

        System.out.print(work.ReturnMax(arr) + " " + work.ReturnMin(arr) + " ");
        System.out.print(work.Reverse(arr));
    }
}
