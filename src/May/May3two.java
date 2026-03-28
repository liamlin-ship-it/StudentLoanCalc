package May;

import java.util.Scanner;

class Bank{
    private double assets;
    private final double rate;

    public Bank(double assets, double rate){
        this.assets = assets;
        this.rate = rate;
    }

    public double calculateInterest(){
        return (assets * (1 + rate));
    }

    public void deposit(double amount){
        assets += amount;
        System.out.printf("Assets after deposit: $%,.2f\n", assets);
    }

    public void withdraw(double amount){
        if (assets < amount){
            System.out.println("You are BROKE!");
            System.exit(0);
        }else {
            assets -= amount;
            System.out.printf("Assets after withdraw: $%,.2f\n", assets);
        }
    }
}

public class May3two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double assets = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double deposit1 = scanner.nextDouble();
        double withdraw1 = scanner.nextDouble();
        double deposit2 = scanner.nextDouble();
        double withdraw2 = scanner.nextDouble();

        Bank bank = new Bank(assets, rate);

        bank.deposit(deposit1);
        bank.withdraw(withdraw1);

        bank.deposit(deposit2);
        bank.withdraw(withdraw2);
        System.out.printf("Bank statement: $%,.2f\n", bank.calculateInterest());
    }
}
