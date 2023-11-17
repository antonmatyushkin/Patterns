package iteco.factory.learn;

import java.time.LocalDateTime;

public class ChocolateCake implements Cake {

    public static final int CHOCOLATE_WEIGHT = 50;
    public static final int ONE_CHOCOLATE_CALORIES = 20;

    private final LocalDateTime creationDate;
    private final int weight;

    public ChocolateCake(LocalDateTime creationDate, int weight) {
        this.creationDate = creationDate;
        this.weight = weight;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    @Override
    public int getCalories() {
        return (CHOCOLATE_WEIGHT * ONE_CHOCOLATE_CALORIES) * (weight/100);
    }
}
