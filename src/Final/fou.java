package Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> records = DataCollector2.getInputData(scanner, 5);

        // Get the field name to count values
        String field = scanner.next();

        scanner.close();

        // Create an instance of DataAnalyzer and count values in a specific field
        DataAnalyzer2 analyzer = new DataAnalyzer2(records);
        HashMap<String, Integer> result = analyzer.countValues(field);

        // Sort the result by key and print it
        Object[] keys = result.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.println(key + ": " + result.get(key));
        }
    }
}

class DataCollector2 {
    // Static method to get input data from the user
    public static ArrayList<HashMap<String, String>> getInputData(Scanner scanner, int numberOfRecords) {
        ArrayList<HashMap<String, String>> records = new ArrayList<>();
        for (int i = 0; i < numberOfRecords; i++) {
            HashMap<String, String> record = new HashMap<>();
            String name = scanner.next();
            String course = scanner.next();
            String grade = scanner.next();
            record.put("name", name);
            record.put("course", course);
            record.put("grade", grade);
            records.add(record);
        }
        return records;
    }
}

class DataAnalyzer2 {
    private final ArrayList<HashMap<String, String>> records;

    // Constructor to initialize records
    public DataAnalyzer2(ArrayList<HashMap<String, String>> records) {
        this.records = records;
    }

    public HashMap<String, Integer> countValues(String field) {
        HashMap<String, Integer> result = new HashMap<>();

        for (HashMap<String, String> record : records){
            String targetValue = record.get(field);
            result.put(targetValue, result.getOrDefault(targetValue, 0) + 1);
        }
        return result;
    }
}
