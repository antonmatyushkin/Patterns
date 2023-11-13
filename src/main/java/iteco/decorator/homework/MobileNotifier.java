package iteco.decorator.homework;

public class MobileNotifier implements Notifier {

    private MessangerNotifier messangerNotifier;

    public MobileNotifier (MessangerNotifier messangerNotifier) {
        this.messangerNotifier = messangerNotifier;
    }

    @Override
    public boolean notifySubscriber() {
        // trying to send via sms
        boolean result = messangerNotifier.notifySubscriber();
        if (result) {
            return true;
        }

        String text2 = messangerNotifier.getText().substring(0, 160);
        return false;
    }
}
