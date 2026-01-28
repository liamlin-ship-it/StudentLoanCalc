import java.util.Scanner;

public class BetterMar21one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0){
            //取最後一個數字
            int digit = num % 10;

            //把數字加起來
            reversed = reversed * 10 + digit;

            //更新num之後繼續檢查下一位
            num /= 10;
        }

        System.out.println(reversed);
    }
}
