package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // Get four strings from the user
        ArrayList<String> inputList = getUserInput();

        // Try to convert each string and print the results
        String creditCardNumber = buildCreditCardNumber(inputList);
        System.out.println(creditCardNumber);
    }

    // This helper method reads a specified number of strings from the user
    public static ArrayList<String> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String input = scanner.next();
            inputList.add(input);
        }

        return inputList;
    }

    // This method builds a credit card number from a list of strings
    public static String buildCreditCardNumber(ArrayList<String> strList) {
        // Concatenate the numbers from the list
        String creditCardNumber = "";

        for (String str : strList) {
            // Convert the string to an integer and format it with leading zeros

            try {
                int num = Integer.parseInt(str);
                creditCardNumber += String.format("%04d", num);
            }catch (Exception e){
                System.out.println("Invalid input");
                System.exit(0);
            }

        }

        return creditCardNumber;
    }
}
