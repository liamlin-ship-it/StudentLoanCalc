import java.util.Scanner;

public class Mar3one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] spl = input.split(" ");

        boolean found = false;
        for (String i : spl){
            if (i.length() >= 5){
                found = true;
                System.out.print(i + " ");
            }
        }

        if (!found){
            System.out.println("None");
        }
    }
}
