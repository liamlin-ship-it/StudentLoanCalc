import java.util.Scanner;

public class Apr11one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double newValue = increment(x, y);
        System.out.println(Math.round(newValue));
    }

    public static double increment(int x, double y){
        return (x - y) * (x + y / 2);
    }
}
