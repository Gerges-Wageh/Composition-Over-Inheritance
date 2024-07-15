package composition;

import composition.move.IMovable;

public class Parrot extends Bird{
    public Parrot(String color, String name, IMovable movable) {
        super(color, name, movable);
    }

}
