package iteco.decorator.learn;

public class SedanCar implements Car {

    private static final int MAX_SPEED = 150;

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
}
