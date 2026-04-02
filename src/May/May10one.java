package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May10one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        // Read the first time
        String name = scanner.next();
        while (!name.equals(".")){
            nameList.add(name);
            // Read  the next word so the loop will be updated
            name = scanner.next();
        }

        String target = scanner.next();

        if (nameList.contains(target)){
            System.out.println(target + " is in the list at index " + nameList.indexOf(target));
        }else {
            System.out.println(target + " is not in the list.");
        }
    }
}
