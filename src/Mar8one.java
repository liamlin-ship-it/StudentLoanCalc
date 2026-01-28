import java.util.Scanner;

public class Mar8one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial = scanner.nextInt();
        int distance = scanner.nextInt();
        int count = scanner.nextInt();

        int current = initial;

        //我們只需要數「印了幾次」，不用管數字變多大
        for (int i = 0; i < count; i++){
            //印出目前的數字
            System.out.print(current + " ");
            //印完之後再加上距離
            current = current + distance;
        }
    }
}
