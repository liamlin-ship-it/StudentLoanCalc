package May;

import java.util.ArrayList;
import java.util.Scanner;

public class May16two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] row = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        ArrayList<String> str = new ArrayList<>();

        for (String word : arr){
            // convert each word to lowercase
            String lowerWord = word.toLowerCase();

            // this variable will remember which row the first letter belongs to
            char firstChar = lowerWord.charAt(0);
            int targetRow = -1;

            for (int i = 0; i < 3; i++) {
                // find which row does the first letter lives in
                if (row[i].indexOf(firstChar) != -1){
                    //if it is not -1, we know we found the correct row
                    targetRow = i;
                    break;
                }
            }

            boolean isValid = true;
            for (int i = 0; i < lowerWord.length(); i++) {
                char currentChar = lowerWord.charAt(i);
                // if indexOf returns -1, it means the letter is missing from this row
                if (row[targetRow].indexOf(currentChar) == -1){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                str.add(word);
            }
        }
        System.out.println(str);
        scanner.close();
    }
}
