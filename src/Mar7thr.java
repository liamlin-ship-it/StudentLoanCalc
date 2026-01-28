import java.util.Scanner;

public class Mar7thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        boolean leap = false;
        if (year % 400 == 0){
            leap = true;
        } else if (year % 100 != 0 && year % 4 == 0) {
            leap = true;
        }

        if (leap){
            System.out.println(year + " is leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }

        if (month == 1){
            System.out.println("January has 31 days.");
        } else if (month == 2 && leap) {
            System.out.println("February has 29 days.");
        }  else if (month == 2) {
            System.out.println("February has 28 days.");
        } else if (month == 3) {
            System.out.println("March has 31 days.");
        } else if (month == 4) {
            System.out.println("April has 30 days.");
        } else if (month == 5) {
            System.out.println("May has 31 days.");
        } else if (month == 6) {
            System.out.println("June has 30 days.");
        } else if (month == 7) {
            System.out.println("July has 31 days.");
        } else if (month == 8) {
            System.out.println("August has 31 days.");
        } else if (month == 9) {
            System.out.println("September has 30 days.");
        } else if (month == 10) {
            System.out.println("October has 31 days.");
        } else if (month == 11) {
            System.out.println("November has 30 days.");
        } else if (month == 12) {
            System.out.println("December has 31 days.");
        }else {
            System.out.println("Error month: " + month);
        }
    }
}
