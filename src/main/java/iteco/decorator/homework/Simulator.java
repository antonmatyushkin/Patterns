package iteco.decorator.homework;

public class Simulator {

    public static void main(String[] args) {
        String phone = "8-916-123-45-67";
        String text = "Рассылка через мессенджер.";
        MessangerNotifier messangerNotifier = new MessangerNotifier(phone, text);
        System.out.println("Мессенджер рассылка = " + messangerNotifier.notifySubscriber());
        MobileNotifier mobileNotifier = new MobileNotifier(messangerNotifier);
        System.out.println("СМС рассылка = " + mobileNotifier.notifySubscriber());
    }
}
