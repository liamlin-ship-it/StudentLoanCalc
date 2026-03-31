package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May9one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int sum = 0;
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();

            num.add(n);
            sum += n;
        }
        System.out.print(sum + " " + num.size());
    }
}
