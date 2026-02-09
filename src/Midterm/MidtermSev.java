package Midterm;

import java.util.Scanner;

public class MidtermSev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++)
            scores[i] = scanner.nextInt();

        //call for the method below
        adjustScores(scores);

        for (int i = 0; i < n; i++)
            System.out.print(scores[i] + " ");

        scanner.close();
    }

    public static void adjustScores(int[] scores) {
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > 55 && scores[i] < 60){
                scores[i] = 60;
            } else if (scores[i] > 100) {
                scores[i] = 100;
            }
        }
    }
}
