package iteco.factory.homework;

import java.time.LocalDateTime;
import java.util.PrimitiveIterator;

public class SedanCar implements Car {

    private final int weight;
    private final LocalDateTime creationDate;
    private final double capacity;

    public SedanCar(int weight, LocalDateTime creationDate, double capacity) {
        this.weight = weight;
        this.creationDate = creationDate;
        this.capacity = capacity;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public LocalDateTime getDateCreation() {
        return this.creationDate;
    }

    @Override
    public double getEngineCapacity() {
        return this.capacity;
    }
}
