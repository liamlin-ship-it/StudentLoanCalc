import java.util.Scanner;

class Square{
    private int edge;

    void setEdge(int edge){
        this.edge = edge;
    }

    public int getEdge(){
        return edge;
    }

    public int perimeter(){
        return edge * 4;
    }

    public int area(){
        return edge * edge;
    }
}

public class Apr26thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge = scanner.nextInt();

        Square square = new Square();
        square.setEdge(edge);

        System.out.print(square.getEdge() + " ");
        System.out.print(square.perimeter() + " ");
        System.out.print(square.area() + " ");
    }
}
