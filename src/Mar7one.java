import java.util.Scanner;

public class Mar7one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
