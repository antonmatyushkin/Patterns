package iteco.command.homework;

import java.util.ArrayList;

public class CommandPool extends Thread {

    private ArrayList<AircraftCommand> commands;

    public CommandPool(ArrayList<AircraftCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void run() {
        while (true) {
            if (commands.size() == 0) {
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                AircraftCommand command = commands.remove(0);
                CommandExecutor executor = new CommandExecutor(command);
                executor.start();
            }
        }
    }
}
