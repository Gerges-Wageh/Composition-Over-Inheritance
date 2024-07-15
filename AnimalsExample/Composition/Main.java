package Composition;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(new DogEatingBehavior(), new DogSleepingBehavior());
        dog.eat();
        dog.sleep();

        // Now lets make use of interchangeable objects
        dog.setEatingBehavior(new DogFastEatingBehavior());
        dog.eat();
    }
}

// Composition is more flexible that inheritance
