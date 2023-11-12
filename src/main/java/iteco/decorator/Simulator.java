package iteco.decorator;

import learn_by_books.decorator.SedanCar;
import learn_by_books.decorator.SportCar;

public class Simulator {

    public static void main(String[] args) {
        String phone = "8-916-123-45-67";
        String text1 = "Рассылка через мессенджер.";
        String text2 = "Рассылка через sms.";
        MessangerNotifier messangerNotifier = new MessangerNotifier(phone, text1);
        System.out.println("Рассылка через мессанджер = " + messangerNotifier.notifySubscriber());
        MobileNotifier mobileNotifier = new MobileNotifier(messangerNotifier);
        System.out.println("Рассылка через SMS = " + mobileNotifier.notifySubscriber());
    }
}
