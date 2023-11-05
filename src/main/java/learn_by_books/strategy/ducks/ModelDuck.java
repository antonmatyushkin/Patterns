package learn_by_books.strategy.ducks;

import learn_by_books.strategy.fly.FlyNoWay;
import learn_by_books.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
