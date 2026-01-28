import java.util.ArrayList;
import java.util.Scanner;

class Record{
    String name;
    int money;

    Record(String n, int m){
        this.name = n;
        this.money = m;
    }
}

public class SimpleExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Record> list = new ArrayList<>();

        while (true){
            System.out.println("Please enter items: (or enter -1 to end)");
            String inputName = scanner.next();

            if (inputName.equals("-1")){
                break;
            }

            System.out.println("Please enter the price: ");
            int inputPrice = scanner.nextInt();

            Record newRecord = new Record(inputName, inputPrice);

            list.add(newRecord);   //把東西都加到newRecord裡面
            System.out.println("Saved");
        }

        int total = 0;

        for (Record r : list){
            System.out.println(r.name + " : $" + r.money);
            total += r.money;
        }
        System.out.println("Total: $" + total);
    }
}
