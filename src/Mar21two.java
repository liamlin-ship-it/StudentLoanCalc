import java.util.Scanner;

public class Mar21two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //先執行 rev(n) 算出反轉數
        //再執行 rev(rev(n)) 算出「反轉再反轉」
        //最後把這兩個丟進 isp 去比較
        System.out.println(rev(n) + " " + isp(rev(n), rev(rev(n))));
    }

    //int 代表這個方法最後一定要回傳一個整數
    public static int rev(int a){
        int reversed = 0;

        while (a != 0){
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }
        return reversed;
    }

    public static boolean isp(int a, int b){
        return a == b;
    }
}
