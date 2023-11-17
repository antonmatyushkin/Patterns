package iteco.factory.learn;

public class Simulator {

    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();
        Cake cherry = factory.getCake(CakeType.CHERRY);
        System.out.println("Вишневый торт " + cherry.getCalories() + " гр., изготовлен " + cherry.getCreationDate());
        Cake chocolate = factory.getCake(CakeType.CHOCOLATE);
        System.out.println("Шоколадный торт " + chocolate.getCalories() + " гр., изготовлен " + chocolate.getCreationDate());
    }


}
