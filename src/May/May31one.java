package May;

class animal{
    void speak(){
        System.out.println("The animal makes a sound.");
    }
}

class bird extends animal{
    @Override
    void speak() {
        System.out.println("tweak!");
    }
}

class cow extends animal {
    @Override
    void speak() {
        System.out.println("moo!");
    }
}

public class May31one {
    public static void main(String[] args) {
        animal genericanimal = new animal();
        bird mybird = new bird();
        cow mycow = new cow();
        // you can only put 'animal' inside
        animal[] animals = {genericanimal, mybird, mycow};
        for (animal eachAnimal : animals) {
            eachAnimal.speak();
        }
    }
}
