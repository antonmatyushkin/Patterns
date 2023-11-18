package iteco.command.homework;

public class CommandExecutor extends Thread {

    private AircraftCommand command;

    public CommandExecutor(AircraftCommand command) {
        this.command = command;
    }

    @Override
    public void run() {
        try {
            sleep(1000 * command.getInterval());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
