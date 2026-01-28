import java.util.Scanner;

public class Mar22one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String year = input.substring(0, 4);
        String month = input.substring(4, 6);
        String date = input.substring(6, 8);

        int parYear = Integer.parseInt(year);
        int parMonth = Integer.parseInt(month);
        int parDate = Integer.parseInt(date);
        boolean isLeap = parYear % 4 == 0 && parYear % 100 != 0 || parYear % 400 == 0;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (parMonth < 1 || parMonth > 12){
            System.out.println(input + " is wrong date.");
        } else{
            if (isLeap){
                daysInMonth[2] = 29;
            }

            if (parDate < 1 || parDate > daysInMonth[parMonth]){
                System.out.println(input + " is wrong date.");
            }else {
                System.out.println(input + " is correct date.");
            }
        }
    }
}
