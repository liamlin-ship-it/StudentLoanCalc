import java.text.DecimalFormat;
import java.util.Scanner;

public class Feb29two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] num = new double[n];

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextDouble();
        }

        double highest = num[0];
        double lowest = num[0];
        double sum = 0;
        for (int i = 0; i < n; i++){
            if (num[i] < 0 || num[i] > 100){
                System.out.println("out of range!");
                return;
            }
            if (num[i] > highest){
                highest = num[i];
            }
            if (num[i] < lowest) {
                lowest = num[i];
            }
            sum += num[i];
        }

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print(df.format(highest) + " ");
        System.out.print(df.format(lowest) + " ");
        System.out.print(df.format(sum / n));
    }
}
