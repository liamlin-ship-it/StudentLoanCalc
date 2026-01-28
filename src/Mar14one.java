import java.util.Scanner;

public class Mar14one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int balance = 0;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if (ch == '('){
                balance++;
            }else if (ch == ')'){
                if (balance == 0){
                    System.out.println("Asymmetric ')' bracket appears at index " + i);
                    return;
                }else{
                    balance--;
                }
            }
        }

        if (balance > 0){
            System.out.println(balance + " asymmetric '(' bracket(s)");
        }else if (balance == 0){
            System.out.println("\"" + input + "\" have symmetric brackets");
        }
    }
}
