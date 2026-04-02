package May;

import java.util.HashMap;
import java.util.Scanner;

public class May10two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> courseList = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            String course = scanner.next();
            String room = scanner.next();
            courseList.put(course, room);
        }

        String myCourse = scanner.next();

        if (courseList.containsKey(myCourse)){
            String room = courseList.get(myCourse);
            System.out.println("Classroom for " + myCourse + ": " + room);
        }else {
            System.out.println("Class not found.");
        }
    }
}
