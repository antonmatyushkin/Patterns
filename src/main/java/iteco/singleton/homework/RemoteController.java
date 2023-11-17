package iteco.singleton.homework;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class RemoteController implements Externalizable {

    private static RemoteController instance;
    private boolean connected;

    private RemoteController() {
    }

    public void connect(String address) {
        if (connected) {
            return;
        }
        connected = true;
        // логика подключения
    }

    public static synchronized RemoteController getInstance() {
        if (instance == null) {
            instance = new RemoteController();
        }
        return instance;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        throw new UnsupportedOperationException("Serialization is denied.");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Serialization is denied.");
    }

}
