package May;

import java.util.HashMap;
import java.util.Scanner;

public class May17two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> buyList = new HashMap<>();

        String item = scanner.next();
        while (!item.equals(".")){
            if (buyList.containsKey(item)){
                buyList.replace(item, buyList.get(item) + 1);
            }else {
                buyList.put(item, 1);
            }
            item = scanner.next();
        }

        System.out.println(buyList);
        scanner.close();
    }
}
