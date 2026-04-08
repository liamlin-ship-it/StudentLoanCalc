package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May24one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()){
            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            if (currentNumber % 2 != 0){
                numbers.set(i, currentNumber + 1);
            }
        }

        for (int num : numbers){
            System.out.println(num + "");
        }
        scanner.close();
    }
}
