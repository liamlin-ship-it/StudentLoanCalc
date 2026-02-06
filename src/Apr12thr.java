import java.util.Scanner;

class Bank{
    double rate;
    double price;
    int time;

    public Bank(double rate, double price, int time){
        this.rate = rate;
        this.price = price;
        this.time = time;
    }

    public double calculate(){
        return price * Math.pow(1 + rate, time);
    }
}

public class Apr12thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = scanner.nextDouble();
        double price = scanner.nextDouble();
        int time = scanner.nextInt();

        Bank bank = new Bank(rate, price, time);
        System.out.printf("%.3f", bank.calculate());
    }
}
