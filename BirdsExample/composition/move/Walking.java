package composition.move;

public class Walking implements IMovable{
    @Override
    public void move() {
        System.out.println("I'm Moving... (Composition)");
    }
}
