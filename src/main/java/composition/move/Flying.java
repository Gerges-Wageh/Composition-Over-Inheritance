package composition.move;

public class Flying implements IMovable{
    @Override
    public void move() {
        System.out.println("I'm Flying... (Composition)");
    }
}
