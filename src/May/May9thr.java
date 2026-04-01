package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May9thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> rank = new ArrayList<>();

        // Read all integers from input until there are no more
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            num.add(n);
            rank.add(n + " ");
        }

        String[] str = {"1st", "2nd", "3rd"};

        // Find the top 3 largest values and replace their rank entries with labels
        for (int i = 0; i < 3; i++) {
            rank.set(maxIndex(num), str[i]);
        }

        for (int i = 0; i < rank.size(); i++) {
            System.out.print(rank.get(i));
            if (i < rank.size() - 1){
                System.out.print(" ");
            }
        }
    }

    public static int maxIndex(ArrayList<Integer> num){
        int index = 0;
        int max = num.getFirst();

        // Linear scan to find the index of the maximum value
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) > max){
                max = num.get(i);
                index = i;
            }
        }

        num.set(index, Integer.MIN_VALUE);
        return index;
    }
}
