package May;

import java.util.Scanner;

record Alphabet(String s) {

    public int CountUpperCase(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public int CountLowerCase(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }
}

public class May2thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Alphabet alphabet = new Alphabet(input);
        System.out.println(alphabet.CountUpperCase(input) + " " + alphabet.CountLowerCase(input));
    }
}
