package iteco.factory.learn;

import java.time.LocalDateTime;

public class CherryCake implements Cake {

    public static final int CHERRY_COUNT = 10;
    public static final int ONE_CHERRY_CALORIES = 50;

    private final LocalDateTime creationDate;
    private final int weight;

    public CherryCake(LocalDateTime creationDate, int weight) {
        this.creationDate = creationDate;
        this.weight = weight;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    @Override
    public int getCalories() {
        return (CHERRY_COUNT * ONE_CHERRY_CALORIES) * (weight/100);
    }
}
