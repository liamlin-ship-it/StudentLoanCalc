import java.util.Scanner;

public class Feb23two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] num = new int[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                num[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < column; j++){
            if (j % 2 == 0){
                for (int i = 0; i < row; i++){
                    System.out.print(num[i][j] + " ");
                }
            }else {
                for (int i = row - 1; i >= 0; i--){
                    System.out.print(num[i][j] + " ");
                }
            }
        }
    }
}
