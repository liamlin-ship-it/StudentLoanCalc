package Midterm;

import java.util.Scanner;

class Grade{
    String studentName;
    int courseGrade;

    Grade(String studentName, int courseGrade){
        this.studentName = studentName;
        this.courseGrade = courseGrade;
    }

    String getInfo(){
        return "Student:" + studentName + ",Grade:" + courseGrade;
    }
}

public class MidtermFiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Grade[] grades = new Grade[n];

        for (int i = 0; i < n; i++) {
            String studentName = scanner.next();
            int courseGrade = scanner.nextInt();

            grades[i] = new Grade(studentName, courseGrade);
        }

        for (Grade grade : grades){
            System.out.print(grade.getInfo() + " ; ");
        }
    }
}
