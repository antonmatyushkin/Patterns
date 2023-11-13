package iteco.decorator.learn;

public class SportCar implements Car {

    private Car car;
    private boolean turboMode;
    private static final int SPEED_INCREASE = 50;

    public SportCar(Car car) {
        this.car = car;
    }

    @Override
    public int getMaxSpeed() {
        return this.car.getMaxSpeed() + (turboMode ? SPEED_INCREASE : 0);
    }

    public void switchTurboOn() {
        this.turboMode = true;
    }
}
