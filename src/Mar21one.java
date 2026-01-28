import java.util.Scanner;

public class Mar21one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.charAt(0) == '-'){
            System.out.print('-');
            for (int i = input.length() - 1; i > 0; i--){
                char ch = input.charAt(i);
                System.out.print(ch);
            }
        }else {
            for (int i = input.length() - 1; i >= 0; i--){
                char ch = input.charAt(i);
                System.out.print(ch);
            }
        }
    }
}
