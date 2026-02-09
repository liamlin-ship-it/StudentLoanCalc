package Midterm;

import java.util.Scanner;

public class MidtermOne {
    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hello " + input);
    }
}
