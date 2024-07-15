package Inheritance;

import Inheritance.MultileSubclasses.FastEating;
import Inheritance.MultileSubclasses.NormalEating;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        // Now imagine that you need a dog that sometimes eats quickly and sometimes normally
        // With inheritance you would need multiple subclasses.

        Dog dog2 = new FastEating();
        dog2.eat();
        dog2 = new NormalEating();
        dog2.eat();

        // You will end up with a complex and deep hierarchy inheritance that would make
        // the code is hard to understand and maintain.
        // Let's see the Composition design...
    }
}
