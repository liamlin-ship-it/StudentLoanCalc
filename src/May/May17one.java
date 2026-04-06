package May;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class May17one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> friends = new ArrayList<>();

        int n = scanner.nextInt();

        for (int j = 0; j < n; j++) {
            // inside the loop so we have a blank slate for each person
            HashMap<String, String> person = new HashMap<>();
            person.put("Name", scanner.next());
            person.put("Office", scanner.next());
            person.put("Ext", scanner.next());

            // now that the 'person' HashMap is filled out, add it to our 'friends' list
            friends.add(person);
        }

        for (HashMap<String, String> eachPerson : friends) {
            System.out.println("Name: " + eachPerson.get("Name"));
            System.out.println("Office: " + eachPerson.get("Office"));
            System.out.println("Ext: " + eachPerson.get("Ext"));
            System.out.println();
        }
        scanner.close();
    }
}
