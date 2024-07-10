package composition;

import composition.move.Flying;
import composition.move.HighFlying;
import composition.move.IMovable;
import composition.move.Walking;

public class Main {
    public static void main(String[] args) {

        IMovable flying = new Flying();
        IMovable walking = new Walking();
        IMovable highFlying = new HighFlying();

        // We choose the feature of moving polymorphically via interchangeable objects
        Owl owl = new Owl("Brown", "Jack", highFlying);
        Parrot parrot = new Parrot("Orange", "Tom", flying);
        Ostrich ostrich = new Ostrich("Black", "Fifi", walking);

        parrot.move();
        ostrich.move();
        owl.move();

    }
}
