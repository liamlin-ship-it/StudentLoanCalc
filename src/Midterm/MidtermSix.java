package Midterm;

import java.util.Scanner;

class NumberPair{
    int number1;
    double number2;

    NumberPair(int number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    double getSum(){
        return number1 + number2;
    }

    double getProduct(){
        return number1 * number2;
    }
}

public class MidtermSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        NumberPair[] numberPairs = new NumberPair[n];

        for (int i = 0; i < n; i++) {
            int number1 = scanner.nextInt();
            double number2 = scanner.nextDouble();

            numberPairs[i] = new NumberPair(number1, number2);
        }

        for (int i = 0; i < n; i++)
            System.out.print(numberPairs[i].getSum() + " ");

        for (int i = 0; i < n; i++)
            System.out.print(numberPairs[i].getProduct() + " ");

        scanner.close();
    }
}
