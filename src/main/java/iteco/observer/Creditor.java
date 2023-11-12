package iteco.observer;

public class Creditor {

    private final int idNumber;
    private final String name;

    public Creditor(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }
}
