import java.util.Scanner;

public class Mar8thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] spl = input.split("");

        String[] symbol = {"I", "V", "X", "L", "C", "D", "M"};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        int sum = 0;   //用來存總和

        for (int i = 0; i < spl.length; i++){
            int currentVal = 0;

            for (int k = 0; k < symbol.length; k++){
                if (spl[i].equals(symbol[k])){
                    currentVal = value[k];
                    break;
                }
            }

            int nextVal = 0;
            if (i < spl.length - 1){   //只有在不是最後一個字的時候才要找
                for (int k = 0; k < symbol.length; k++){
                    if (spl[i + 1].equals(symbol[k])){
                        nextVal = value[k];
                        break;
                    }
                }
            }

            //如果currentVal比nextVal小就要減掉
            if (currentVal < nextVal){
                sum -= currentVal;
            }else {
                sum += currentVal;
            }
        }
        System.out.println(sum);
    }
}
