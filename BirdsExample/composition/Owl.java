package composition;

import composition.move.IMovable;

public class Owl extends Bird{
    public Owl(String color, String name, IMovable movable) {
        super(color, name, movable);
    }
}
