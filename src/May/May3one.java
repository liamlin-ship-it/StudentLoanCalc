package May;

import java.util.Scanner;

record Alp(String s){

    public int CounterUpperCase(String s){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                count++;
            }
        }
        return count;
    }

    public int CounterLowerCase(String s){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                count++;
            }
        }
        return count;
    }
}

public class May3one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Alp alp = new Alp(input);
        System.out.println(alp.CounterUpperCase(input) + " " + alp.CounterLowerCase(input));
    }
}
