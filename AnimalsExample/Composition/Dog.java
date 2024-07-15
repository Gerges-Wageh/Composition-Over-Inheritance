package Composition;

public class Dog {
    private IEatingBehavior eatingBehavior;
    private DogSleepingBehavior sleepingBehavior;

    public Dog(IEatingBehavior eatingBehavior, DogSleepingBehavior sleepingBehavior) {
        this.eatingBehavior = eatingBehavior;
        this.sleepingBehavior = sleepingBehavior;
    }

    public void setEatingBehavior(IEatingBehavior eatingBehavior) {
        this.eatingBehavior = eatingBehavior;
    }

    public void setSleepingBehavior(DogSleepingBehavior sleepingBehavior) {
        this.sleepingBehavior = sleepingBehavior;
    }

    public void eat(){
        eatingBehavior.eat();
    }
    public void sleep(){
        sleepingBehavior.sleep();
    }

}
