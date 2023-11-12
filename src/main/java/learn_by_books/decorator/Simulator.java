package learn_by_books.decorator;

public class Simulator {

    public static void main(String[] args) {
        SedanCar sedan = new SedanCar();
        System.out.println("Скорость седана = " + sedan.getMaxSpeed());
        SportCar sportCar = new SportCar(sedan);
        System.out.println("Скорость седана без турбо режима = " + sportCar.getMaxSpeed());
        sportCar.switchTurboOn();
        System.out.println("Скорость седана с турбо режимом = " + sportCar.getMaxSpeed());
    }
}
