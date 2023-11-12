package iteco.decorator;

public final class MessangerNotifier implements Notifier {

    private String phone;
    private String text;

    public MessangerNotifier(String phone, String text) {
        this.phone = phone;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean notifySubscriber() {
        // trying to send via messenger
        return true;
    }
}
