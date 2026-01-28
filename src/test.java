import java.util.Scanner;
record Arithmetic(int start, int distance, int count) {
    //record是新的用法 可以代替class
    //建議先用class就好，以免搞混
    public void print(){
        int current = this.start;

        for (int i = 0; i < this.count; i++){
            System.out.print(current + " ");
            current += this.distance;
        }
        System.out.println();
    }
}


public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        Arithmetic seq = new Arithmetic(a, d, n);

        seq.print();
    }
}
