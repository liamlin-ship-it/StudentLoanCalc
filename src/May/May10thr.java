package May;

import java.util.ArrayList;
import java.util.Scanner;

record Animal(String name, int amount) {

    public String toString() {
        return "Animal name: " + name + ", amounts: " + amount;
    }
}

class Zoo2 {
    private final ArrayList<Animal> animals;

    public Zoo2(){
        animals = new ArrayList<>();
        addSomeAnimals();
    }

    // A simple method to add a single new Animal object to our list
    public void add(Animal name_amount){
        animals.add(name_amount);
    }

    public void addSomeAnimals(){
        animals.add(new Animal("Lion", 3));
        animals.add(new Animal("Tiger", 3));
        animals.add(new Animal("Zebra", 6));
        animals.add(new Animal("Giraffe", 5));
        animals.add(new Animal("Elephant", 4));
        animals.add(new Animal("BrownBear", 2));
        animals.add(new Animal("GiantPanda", 2));
        animals.add(new Animal("Chimpanzee", 6));
    }

    public String toString(){
        StringBuilder result  = new StringBuilder();
        // Iterate through each animal in the collection
        for (Animal animal : animals){
            // Convert the animal object to a string and append it,
            // then add a newline to separate each entry
            result.append(animal.toString()).append("\n");
        }
        return result.toString();
    }

    public ArrayList<Animal> searchForAnimal(String letter){
        // Create an empty list to store matching animals
        ArrayList<Animal> result = new ArrayList<>();

        // Iterate through each animal in the collection
        for (Animal animal : animals){
            // Check if the animal's name contains the search string
            if (animal.name().contains(letter)){
                result.add(animal);
            }
        }
        return result;
    }
}

public class May10thr {
    public static void main(String[] args) {
        Zoo2 zoo = new Zoo2();

        zoo.add(new Animal("RedPanda", 4));
        zoo.add(new Animal("Capybara", 6));
        zoo.add(new Animal("Otter", 6));

        Scanner scanner = new Scanner(System.in);
        String searchLetter = scanner.next();
        scanner.close();

        System.out.println("Search for animals with letter \"" + searchLetter + "\":");

        // Run the search method and save the returned list
        ArrayList<Animal> result = zoo.searchForAnimal(searchLetter);

        if (result.isEmpty()){
            System.out.println("None.");
        }else {
            // Loop through the matched animals and print them
            for (Animal animal : result){
                System.out.println(animal);
            }
        }
    }
}
