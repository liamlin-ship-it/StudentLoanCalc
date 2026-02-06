//Problem: Calculate Life Path Number

//Description:
//Sum every digit of the birth year, month, and day.
//If the result is a two-digit number, continue adding its digits together until a single-digit number is obtained.

//Example:
//20240322 -> 2+0+2+4+0+3+2+2 = 15
//15 -> 1+5 = 6
//Life Path Number: 6

import java.util.Scanner;

public class Mar22thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int add = Integer.parseInt(input);

        if (!isDateCorrect(input)){
            System.out.println(input + " is wrong date.");
        }else {
            do {
                add = addAllNums(add);
            }

            while (add > 9);
            System.out.println(input + " -> " + add);

            //也可以寫while
            //while (add > 9){
                //add = addAllNums(add);
            //}
            //System.out.println(input + " -> " + add);
        }
    }

    public static boolean isDateCorrect(String input){
        String year = input.substring(0, 4);
        String month = input.substring(4, 6);
        String date = input.substring(6, 8);

        int parYear = Integer.parseInt(year);
        int parMonth = Integer.parseInt(month);
        int parDate = Integer.parseInt(date);
        boolean isLeap = parYear % 4 == 0 && parYear % 100 != 0 || parYear % 400 == 0;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (parMonth < 1 || parMonth > 12){
            return false;
        }

        if (isLeap){
            daysInMonth[2] = 29;
        }
        return parDate >= 1 && parDate <= daysInMonth[parMonth];
    }

    public static int addAllNums(int input){
        int sum = 0;
        while (input > 0){
            sum += input % 10;
            input = input / 10;
        }
        return sum;
    }
}
