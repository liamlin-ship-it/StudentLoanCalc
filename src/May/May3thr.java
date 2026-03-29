package May;

import java.util.Scanner;

class Zoo {
    private final String animal;
    private int feed;
    private int buyTimes;

    public Zoo(String animal){
        this.animal = animal;
        this.feed = 1000;
    }

    // Returns the name of the animal
    public String getAnimal(){
        return animal;
    }

    // Sets the maximum number of times we are allowed to buy feed
    public void setBuyTime(int buyTimes){
        this.buyTimes = buyTimes;
    }

    // Feeds the animal once. Costs 100 feed.
    public void feedOnce(){
        if (feed < 100){
            this.buyFeed();
        }
        feed -= 100;
    }

    // Buys feed, adding 100 to the stock and consuming 1 buy turn
    public void buyFeed(){
        if (buyTimes != 0){
            feed += 100;
            buyTimes--;
        }else {
            System.out.println("No enough feed!!");
            System.exit(0);
        }
    }

    // Calculates total feed remaining
    public int remainFeed(){
        int result;
        if (buyTimes != 0){
            result =  feed + (buyTimes * 100);
        }else {
            result = feed;
        }
        return result;
    }
}

public class May3thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();
        int feed = scanner.nextInt();
        int buyTimes = scanner.nextInt();

        Zoo zoo = new Zoo(animal);
        zoo.setBuyTime(buyTimes);

        // Feed the animal the requested number of times
        for (int i = 0; i < feed; i++) {
            zoo.feedOnce();
        }

        System.out.println("I have a(n) " + zoo.getAnimal());
        System.out.println("Remain Feed: " + zoo.remainFeed());
    }
}
