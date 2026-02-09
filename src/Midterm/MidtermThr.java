package Midterm;

import java.util.Scanner;

public class MidtermThr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();

        boolean sayHello = checkThreshold(age);

        if (sayHello)
            greetUserHello(name);
        else
            greetUserHi(name);

        scanner.close();
    }

    public static boolean checkThreshold(int age) {
        return age < 18;
    }

    public static void greetUserHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void greetUserHi(String name) {
        System.out.println("Hi " + name);
    }
}
