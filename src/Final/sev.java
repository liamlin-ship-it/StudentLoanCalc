package Final;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class sev {
    public static void main(String[] args) {
        ArrayList<HashSet<String>> list = new ArrayList<>();

        // Read input data, split by comma, and store in HashSet
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            HashSet<String> set = new HashSet<>();
            for (String value : scanner.nextLine().split(",")) {
                set.add(value);
            }
            list.add(set);
        }

        // Read the value to remove
        String valueToRemove = scanner.nextLine();

        // Remove HashSet objects containing the specified value
        removeSetsContainingValue(list, valueToRemove);

        // Show the first and last elements of the list.
        // The HashSet is shown as string, where the elements are sorted alphabetically.
        if (!list.isEmpty()) {
            ShowSortedSet(list.get(0));
            ShowSortedSet(list.get(list.size() - 1));
        } else {
            System.out.println("Empty");
        }
    }

    private static void removeSetsContainingValue(ArrayList<HashSet<String>> list, String valueToRemove) {
        //HashSet<String> result = new HashSet<>();

        list.removeIf(set -> set.contains(valueToRemove));
    }

    public static void ShowSortedSet(HashSet<String> set) {
        ArrayList<String> sortedList = new ArrayList<>(set);
        sortedList.sort(null);
        System.out.println(String.join(",", sortedList));
    }
}
