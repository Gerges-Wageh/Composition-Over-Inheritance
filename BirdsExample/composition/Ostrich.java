package composition;

import composition.move.IMovable;

public class Ostrich extends Bird{
    public Ostrich(String color, String name, IMovable iMovable) {
        super(color, name, iMovable);
    }

}
