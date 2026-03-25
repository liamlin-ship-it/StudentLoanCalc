package May;

import java.util.Scanner;

class Triangle{
    private double a, b, c;

    public void set(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String isTriangle(){
        if (a > 0 && b > 0 && c > 0){
            if ((a + b > c) && (a + c > b) && (b + c > a)){
                return "true";
            }else{
                return "false";
            }
        }else {
            return "false";
        }
    }

    public void ShowDetail(){
        System.out.println(a + " " + b + " " + c + " " + isTriangle());
    }
}

public class May2one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Triangle triangle = new Triangle();

        triangle.set(a, b, c);
        triangle.ShowDetail();
    }
}
