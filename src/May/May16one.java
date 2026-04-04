package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May16one {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> friends = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            HashMap<String, String> person = new HashMap<>();

            String name = scanner.next();
            String major = scanner.next();
            person.put("name", name);
            person.put("subject", major);
            friends.add(person);
        }

        for (HashMap<String, String> person : friends) {
            System.out.println("Name: " + person.get("name"));
            System.out.println("Subject: " + person.get("subject"));
            System.out.println();
        }
    }
}
