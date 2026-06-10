package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> records = DataCollector.getInputData(scanner, 5);

        // Get the course name and grade from the user
        String courseName = scanner.next();
        String grade = scanner.next();

        scanner.close();

        // Create an instance of DataAnalyzer and print records
        DataAnalyzer analyzer = new DataAnalyzer(records);
        ArrayList<String> names = analyzer.filterRecords(courseName, grade);

        // Print the names of students with the specified grade in the specified course
        if (names.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

class DataCollector {
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

class DataAnalyzer {
    private final ArrayList<HashMap<String, String>> records;

    // Constructor to initialize records
    public DataAnalyzer(ArrayList<HashMap<String, String>> records) {
        this.records = records;
    }

    public ArrayList<String> filterRecords(String courseName, String grade) {
        ArrayList<String> result = new ArrayList<>();

        for (HashMap<String, String> record : records){
            if (courseName.equals(record.get("course")) && grade.equals(record.get("grade"))){
                result.add(record.get("name"));
            }
        }
        return result;
    }
}
