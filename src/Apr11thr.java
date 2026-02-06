import java.util.Scanner;

public class Apr11thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i =0; i < n; i++){
            num[i] = scanner.nextInt();
        }
        int times = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++){
            if (num[i] % 2 == 0){
                evenCount++;
                System.out.print("even ");
            }else {
                oddCount++;
                System.out.print("odd ");
            }

            if (evenCount >= times && oddCount >= times){
                break;
            }
        }
    }
}
