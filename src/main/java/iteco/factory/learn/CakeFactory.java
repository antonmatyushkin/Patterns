package iteco.factory.learn;

import java.time.LocalDateTime;

public class CakeFactory {

    public Cake getCake(CakeType type) {
        Cake cake = null;
        switch (type) {
            case CHERRY:
                cake = new CherryCake(LocalDateTime.now(), 500);
                break;
            case CHOCOLATE:
                cake = new ChocolateCake(LocalDateTime.now(), 600);
                break;
            default:
                throw new IllegalArgumentException("Wrong cake type: " + type);
        }
        return cake;
    }

}
