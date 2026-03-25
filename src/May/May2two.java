package May;

import java.util.Scanner;

class Handle{
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

    public String Reverse(int[] n){
        String result = "";
        for (int i = n.length - 1; i >= 0; i--){
            result += n[i] + " ";
        }
        return result;
    }
}

public class May2two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Handle handle = new Handle();

        System.out.print(handle.ReturnMax(arr) + " " + handle.ReturnMin(arr) + " ");
        System.out.print(handle.Reverse(arr));
    }
}
