package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May9two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            num.add(scanner.nextInt());
        }

        num.add(12);
        num.set(3, 5);
        System.out.print(num.get(1) + " ");
        num.remove(3);
        num.add(5);
        num.set(3, 1);

        for (int result : num){
            System.out.print(result + " ");
        }
    }
}
