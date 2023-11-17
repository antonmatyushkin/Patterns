package iteco.factory.homework;

public class Simulator {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car sedan = factory.getCar(CarType.SEDAN);
        System.out.println("Автомобиль седан: вес = " + sedan.getWeight() + " кг, мощность двигателя = " + sedan.getEngineCapacity() + " л.с., год выпуска = " + sedan.getDateCreation());
        Car jeep = factory.getCar(CarType.JEEP);
        System.out.println("Автомобиль джип: вес = " + jeep.getWeight() + " кг, мощность двигателя = " + jeep.getEngineCapacity() + " л.с., год выпуска = " + jeep.getDateCreation());
    }
}
