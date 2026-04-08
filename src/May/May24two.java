package May;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class May24two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num.add(scanner.nextInt());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!num.contains(i)){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
