package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StringList extends ArrayList<String> {

    public StringList(String input){
        Collections.addAll(this, input.split(","));
    }

    public String join(String sign){
        return String.join(sign, this);
    }
}

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String sign = scanner.next();

        StringList stringList = new StringList(input);

        System.out.println("Joined: " + stringList.join(sign));
        stringList.sort(null);
        System.out.println("Sorted: " + stringList.join(sign));
        stringList.removeFirst();
        System.out.println("Removed head: " + stringList.join(sign));
    }
}
