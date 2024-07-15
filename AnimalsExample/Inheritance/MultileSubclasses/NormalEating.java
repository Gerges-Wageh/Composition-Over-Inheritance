package Inheritance.MultileSubclasses;

import Inheritance.Dog;

public class NormalEating extends Dog {
    @Override
    public void eat() {
        System.out.println("The Dog is eating normally...");
    }
}
