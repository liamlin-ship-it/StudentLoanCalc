import java.util.Scanner;

public class Mar8two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] spl = input.split(" ");

        String[] directionNames = {"N", "E", "S", "W"};
        int direction = 0;

        boolean skipNext = false;   //是否跳過下一個指令
        boolean isReversed = false;   //是否左右相反 (C 指令控制)

        for (String s : spl){
            if (s.equals("0")) break;

            if (skipNext){   //遇到S的時候直接跳下一個
                skipNext = false;
                continue;
            }

            if (s.equals("S")){
               skipNext = true;
            } else if (s.equals("C")) {
                //切換開關：原本正常變反轉，原本反轉變正常
                isReversed = !isReversed;
            } else if (s.equals("R")) {
                if (!isReversed) direction = (direction + 1);
                else             direction = (direction + 3);
            } else if (s.equals("L")) {
                if (!isReversed) direction = (direction + 3);
                else             direction = (direction + 1);
            }
        }
        System.out.println(directionNames[direction % 4]);
    }
}
