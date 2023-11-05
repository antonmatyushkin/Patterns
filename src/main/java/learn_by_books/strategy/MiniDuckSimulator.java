package learn_by_books.strategy;

import learn_by_books.strategy.ducks.MallardDuck;
import learn_by_books.strategy.fly.FlyRocketPowered;
import learn_by_books.strategy.ducks.Duck;
import learn_by_books.strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
