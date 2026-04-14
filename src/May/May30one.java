package May;

import java.util.HashMap;
import java.util.Scanner;

public class May30one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // record the price
        HashMap<String, Integer> fruitPrice = new HashMap<>();
        // record the number of occurrences
        HashMap<String, Integer> buyList = new HashMap<>();

        fruitPrice.put("apple", 10);
        fruitPrice.put("banana", 20);
        fruitPrice.put("cherry", 30);

        int total = 0;

        String item = scanner.next();
        while (!item.equals(".")){
            if (fruitPrice.containsKey(item)){
                total += fruitPrice.get(item);

                // If bought before, it returns the current quantity and stores it in the 'count' variable.
                int count = buyList.getOrDefault(item, 0);
                // Add 1 to the item's quantity and update it back into the buyList
                buyList.put(item, count + 1);
            }else {
                System.out.println("Item not found: " + item);
            }
            item = scanner.next();
        }

        System.out.println("Buy List: " + buyList);
        System.out.printf("Total Price: $%,d", total);
        scanner.close();
    }
}
