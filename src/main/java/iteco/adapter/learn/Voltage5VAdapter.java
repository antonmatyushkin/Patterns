package iteco.adapter.learn;

public class Voltage5VAdapter extends Rosette implements VoltageAdapter {

    @Override
    public int transform() {
        int srcVoltage = output();
        return srcVoltage / 44;
    }
}
