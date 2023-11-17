package iteco.singleton.learn;

import java.io.*;

public final class MailQueue implements Externalizable {

    private static MailQueue instance;

    private MailQueue() {
    }

    public static synchronized MailQueue getInstance() {
        if (instance == null) {
            instance = new MailQueue();
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
