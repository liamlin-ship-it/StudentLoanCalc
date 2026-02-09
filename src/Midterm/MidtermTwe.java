package Midterm;

import java.util.Scanner;

class RingArray{
    private final int size;
    private int[] array;
    //We don't need 'int rotations' here
    //cuz we don't need it permanently

    //Build the empty shelf first
    public RingArray(int size){
        this.size = size;
        this.array = new int[size];
    }

    //Receive value from main and place it into the shelf (array)
    public void setElement(int index, int value){
        this.array[index] = value;
    }

    //'rotations' comes from main,
    //telling us how many times to turn
    public void rotate(int rotations){
        int step = (rotations % size + size) % size;
        int[] temp = new int[size];

        for (int i = 0; i < size; i++){
            temp[(step + i) % size] = array[i];
        }
        array = temp;
    }

    public int[] getArray(){
        return array;
    }
}

public class MidtermTwe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotations = scanner.nextInt();

        RingArray ringArray = new RingArray(size);

        //call for the method 'setElement' from ringArray
        for (int i = 0; i < size; i++) {
            ringArray.setElement(i, scanner.nextInt());
        }

        ringArray.rotate(rotations);

        //call for the method 'getArray' from ringArray
        int[] array = ringArray.getArray();
        for (int result : array){
            System.out.print(result + " ");
        }
    }
}
