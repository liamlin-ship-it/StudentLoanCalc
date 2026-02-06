import java.util.Scanner;

public class Mar28two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        double newValue = increment(value);
        System.out.println(newValue);
        double newValue2 = decrement(newValue);
        System.out.println(newValue2);
    }

    private static double increment(double newValue){
        return newValue + 0.5;
    }

    private static double decrement(double newValue){
        return newValue - 0.3;
    }
}
