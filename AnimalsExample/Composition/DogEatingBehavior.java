package Composition;

public class DogEatingBehavior implements IEatingBehavior{
    @Override
    public void eat(){
        System.out.println("The Dog is eating...");
    }
}
