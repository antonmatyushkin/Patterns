package learn_by_books.strategy.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't strategy.fly!");
    }
}
