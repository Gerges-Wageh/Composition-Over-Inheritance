package Inheritance.MultileSubclasses;

import Inheritance.Dog;

public class FastEating extends Dog {
    @Override
    public void eat() {
        System.out.println("The Dog is eating fast....");
    }
}
