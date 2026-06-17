package Final;

import java.util.Scanner;

public class ele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int[][] arr1 = new int[a1][a2];
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int[][] arr2 = new int[b1][b2];
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < b2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        String checkStr = scanner.next();

        boolean isValid = true;
        int checkNum = 0;

        try {
            checkNum = Integer.parseInt(checkStr);
        }catch (Exception e){
            isValid = false;
        }

        int countZero = 0;
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                if (arr2[i][j] == 0){
                    countZero++;
                }
            }
        }

        if (!isValid && countZero > 0){
            System.out.println(countZero + " zeros in the second matrix");
        }else {
            int[][] result = new int[a1][a2];
            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < a2; j++) {
                    if (arr2[i][j] == 0){
                        result[i][j] = checkNum;
                    }else {
                        result[i][j] = arr1[i][j] / arr2[i][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
