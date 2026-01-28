import java.util.Scanner;

public class Feb29one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        //先處理題目要求的「欲相加之兩整數」
        //這裡必須先讀取兩個數字，不能直接進迴圈
        if (scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        if (scanner.hasNextInt()){
            sum += scanner.nextInt();
        }

        while (true){
            String str = scanner.next();

            //使用 equalsIgnoreCase 可以同時處理 'n' 和 'N'
            if (str.equalsIgnoreCase("n")){
                //如果是 N，立刻停止計算並輸出，絕對不要再讀 nextInt()
                System.out.println(sum);
                break;
            } else if (str.equalsIgnoreCase("y")) {
                //只有確認是 Y 之後，才讀取下一個整數
                if (scanner.hasNextInt()){
                    int num = scanner.nextInt();
                    sum += num;
                }
            }
        }
    }
}
