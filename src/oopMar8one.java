import java.util.Scanner;

record ArithmeticSequence(int start, int distance, int count) {
    public void print(){
        int current = this.start;

        for (int i = 0; i < this.count; i++){
            System.out.print(current + " ");
            current += this.distance;
        }
        System.out.println();
    }
}

public class oopMar8one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        ArithmeticSequence seq = new ArithmeticSequence(a, d, n);

        seq.print();
    }
}
