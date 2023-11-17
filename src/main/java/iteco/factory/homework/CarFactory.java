package iteco.factory.homework;

import java.time.LocalDateTime;

public class CarFactory {

    public Car getCar(CarType type) {
        Car car = null;
        switch (type) {
            case SEDAN:
                car = new SedanCar(1600, LocalDateTime.now(), 1.6);
                break;
            case JEEP:
                car = new JeepCar(2200, LocalDateTime.now(), 2.0);
                break;
            default:
                throw new IllegalArgumentException("Wrong car type: " + type);
        }
        return car;
    }
}
