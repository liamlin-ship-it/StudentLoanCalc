package Midterm;

import java.util.Scanner;

class NonZeroTwoDimArray {
    int rows;
    int cols;
    int[][] arr;
    int currentSum = 0;

    public NonZeroTwoDimArray(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.arr = new int[rows][cols];
    }

    //Parameters (i, j, value) come from the main method
    public void setElement(int i, int j, int value){
        if (value > 0){
            this.arr[i][j] = value;
            this.currentSum += arr[i][j];
        }
    }

    //No parameters needed because 'currentSum' is already stored inside the object
    public int getSum(){
        return this.currentSum;
    }
}

public class MidtermEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        NonZeroTwoDimArray array = new NonZeroTwoDimArray(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = scanner.nextInt();

                //Pass the value to the object to handle storage and summing
                array.setElement(i, j, value);
            }
        }

        System.out.println(array.getSum());

        scanner.close();
    }
}
