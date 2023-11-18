package iteco.command.homework;

public class RaisingFlaps implements AircraftCommand {

    private int seconds;
    private double angleFlaps;

    public RaisingFlaps(int seconds, double angleFlaps) {
        this.seconds = seconds;
        this.angleFlaps = angleFlaps;
    }

    @Override
    public int getInterval() {
        return seconds;
    }
}
