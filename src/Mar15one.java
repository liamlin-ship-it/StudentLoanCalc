import java.util.Scanner;

public class Mar15one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int base = scanner.nextInt();
        String symbol = scanner.next();

        int current = base;
        int count = 0;
        if ("+".equals(symbol)){
            //只要符合條件就一直加下去
            while (current < target){
                current = current + base;
                count++;
            }
        } else if ("-".equals(symbol)) {
            //只要符合條件就一直減下去
            while (current > target) {
                current = current - base;
                count++;
            }
        }

        if (current == target){
            System.out.println(count);
        }else {
            System.out.println(0);
        }
    }
}
