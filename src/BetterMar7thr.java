import java.util.Scanner;

public class BetterMar7thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();

        boolean leap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);

        if (leap) System.out.println(year + " is leap year.");
        else System.out.println(year + " is not leap year.");

        String[] names = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month >= 1 && month <= 12){
            int d = days[month - 1];

            if (month == 2 && leap){
                d = 29;
            }

            System.out.println(names[month - 1] + " has " + d + " days.");
        } else {
            System.out.println("Error month: " + month);
        }
    }
}
