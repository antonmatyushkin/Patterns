package iteco.command.homework;

public class EngineStarting implements AircraftCommand {

    private int seconds;
    private int engineSpeed;

    public EngineStarting(int seconds, int engineSpeed) {
        this.seconds = seconds;
        this.engineSpeed = engineSpeed;
    }

    @Override
    public int getInterval() {
        return seconds;
    }
}
