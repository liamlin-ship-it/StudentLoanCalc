package May;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private final String name;
    private final int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return "Student: " + name + ", Grade:" + grade;
    }
}

class GradeManager {
    private final ArrayList<Student> students;

    public GradeManager() {
        this.students = new ArrayList<>();
    }

    // add a new Student object into our ArrayList
    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students){
            System.out.println(student);
        }
    }
}

public class May30two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager();

        String input = scanner.next();
        while (!input.equals(".")){
            String[] parts = input.split(",");

            String name = parts[0];
            int grade = Integer.parseInt(parts[1]);

            Student student = new Student(name, grade);
            gradeManager.addStudent(student);
            input = scanner.next();
        }

        gradeManager.printAllStudents();
        scanner.close();
    }
}
