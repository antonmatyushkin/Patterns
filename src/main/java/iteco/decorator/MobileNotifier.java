package iteco.decorator;

public class MobileNotifier implements Notifier {

    private MessangerNotifier messangerNotifier;

    public MobileNotifier (MessangerNotifier messangerNotifier) {
        messangerNotifier.getText();
    }

    @Override
    public boolean notifySubscriber() {
        // trying to send via messenger
        return true;
    }
}
