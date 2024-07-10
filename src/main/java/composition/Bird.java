package composition;

import composition.move.IMovable;

public class Bird {
    String color;
    String name;

    //Composition in java is done via having a reference variable of other classes in the owner class.
    IMovable movable;

    public Bird(String color, String name, IMovable iMovable) {
        this.color = color;
        this.name = name;
        this.movable = iMovable;
    }


    // Forwarding Method .. It forwards the behaviour down to its subclasses
    public void move(){
        movable.move();
    }
}
