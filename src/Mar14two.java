import java.util.Scanner;

public class Mar14two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }

        int cars = scanner.nextInt();

        //處理每一輛車
        for (int i = 0; i < cars; i++){
            //先假設都還有空位
            boolean parked = false;
            //掃描每一個停車格
            for (int j = 0; j < n; j++){
                //如果是空的就輸出它的位置
                if (num[j] == 0){
                    System.out.print((j + 1) + " ");
                    num[j] = 1;
                    parked = true;
                    break;
                }
            }
            //如果被停走就輸出0
            if (!parked){
                System.out.print(0 + " ");
            }
        }
    }
}
