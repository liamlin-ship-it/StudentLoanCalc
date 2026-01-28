import java.util.Scanner;

public class InterestCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //輸入貸款總額
        System.out.println("貸款金額: ");
        int loan = scanner.nextInt();

        //輸入年利率
        System.out.println("利率: ");
        double rate = scanner.nextDouble();

        //預計幾年還完
        System.out.println("還款年分: ");
        int years = scanner.nextInt();

        while (years <= 0){
            System.out.println("你來亂的嗎？年分不能是 0 或負數，請重新輸入: ");
            years = scanner.nextInt();
        }

        //貸款總額 * (1 + 利率) / 總月數
        double monthlyPayment = calculateMonthlyPayment(loan, rate, years);

        System.out.println("每月還款: " + monthlyPayment);
        if (monthlyPayment >= 20000){
            System.out.println("這會讓你吃土");
        }else {
            System.out.println("計畫可行");
        }
    }

    public static double calculateMonthlyPayment(int l, double r, int y){
        double result =  Math.round(l * (1 + r) / (y * 12));
        return result;
    }
}
