package Composition;

public class DogFastEatingBehavior implements IEatingBehavior{
    @Override
    public void eat() {
        System.out.println("The Dog is Eating fast....");
    }
}
