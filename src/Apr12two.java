import java.util.Scanner;

class Student{
    private final String name;
    private final String id;
    private int totalCredits = 0;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
        //new student starts with 0 by default
    }

    public void addCredits(int credits){
        this.totalCredits += credits;
    }

    public void printId(){
        System.out.print(name + "'s student ID is " + id);
    }

    public int getCredits(){
        return totalCredits;
    }
}

public class Apr12two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String id = scanner.next();

        Student newStudent = new Student(name, id);
        //You need newStudent to remember the data

        System.out.println();
        while (true){
            int credit = scanner.nextInt();
            if (credit == 0){
                break;
            }
            newStudent.addCredits(credit);
        }

        newStudent.printId();

        System.out.println(", total credits: " + newStudent.getCredits());
    }
}
