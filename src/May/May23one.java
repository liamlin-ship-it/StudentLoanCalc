package May;

import java.util.HashMap;
import java.util.Scanner;

public class May23one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> fruitPrice = new HashMap<>();

        fruitPrice.put("apple", 10);
        fruitPrice.put("banana", 20);
        fruitPrice.put("cherry", 30);

        int totalPrice = 0;
        String item = scanner.next();

        while (!item.equals(".")){
            if (fruitPrice.containsKey(item)){
                totalPrice += fruitPrice.get(item);
            }else {
                System.out.println("Item not found: " + item);
            }
            item = scanner.next();
        }

        System.out.printf("Total Price: $%,d", totalPrice);
        scanner.close();
    }
}
