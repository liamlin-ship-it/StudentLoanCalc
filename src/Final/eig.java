package Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class eig {
    public static void main(String[] args) {
        ArrayList<HashSet<String>> list = new ArrayList<>();

        // Read input data, split by comma, and store in HashSet
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            HashSet<String> set = new HashSet<>(Arrays.asList(scanner.nextLine().split(",")));
            list.add(set);
        }

        // Read the values to remove
        HashSet<String> set = new HashSet<>(Arrays.asList(scanner.nextLine().split(",")));
        HashSet<String> valuesToExclude = new HashSet<>(set);

        // Merge all sets but the one with the value to remove
        HashSet<String> mergedSet = mergeSetsButExcludedValues(list, valuesToExclude);

        // Show the merged set
        if (mergedSet.isEmpty()) {
            System.out.println("Empty");
        } else {
            ShowSortedSet(mergedSet);
        }
    }

    private static HashSet<String> mergeSetsButExcludedValues(ArrayList<HashSet<String>> list, HashSet<String> valuesToExclude) {
        HashSet<String> result = new HashSet<>();

        for (HashSet<String> set : list){
            result.addAll(set);
        }
        result.removeAll(valuesToExclude);
        return result;
    }

    public static void ShowSortedSet(HashSet<String> set) {
        ArrayList<String> sortedList = new ArrayList<>(set);
        sortedList.sort(null);
        System.out.println(String.join(",", sortedList));
    }
}
