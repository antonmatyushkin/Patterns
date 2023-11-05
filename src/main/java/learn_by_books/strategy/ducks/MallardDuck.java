package learn_by_books.strategy.ducks;

import learn_by_books.strategy.quack.Quack;
import learn_by_books.strategy.fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm real Mallard duck!");
    }
}
