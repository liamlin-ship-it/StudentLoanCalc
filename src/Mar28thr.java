import java.util.Scanner;

public class Mar28thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();

        String part1 = input.substring(0, n);
        String part2 = input.substring(n + 1, input.length() - 1);
        System.out.println(part1 + " " + part2);
    }
}
