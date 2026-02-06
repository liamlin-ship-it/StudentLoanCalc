import java.util.Scanner;

public class Mar29thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] a = new int[s];

        for (int i = 0; i < s; i++){
            a[i] = scanner.nextInt();
        }
        int st = scanner.nextInt();
        int en = scanner.nextInt();

        int[] result = tu(a, st, en);

        for (int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] tu(int[] t, int a, int b){
        for (int i = 0; i < t.length; i++){
            if (t[i] >= a && t[i] <= b){
                t[i] = 0;
            }
        }

        return t;
    }
}
