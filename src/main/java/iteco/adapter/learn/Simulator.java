package iteco.adapter.learn;

public class Simulator {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Voltage5VAdapter());
    }

}
