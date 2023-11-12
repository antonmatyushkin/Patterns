package iteco.observer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class Bank {

    private HashMap<Integer, Creditor> creditors;
    private HashMap<Integer, LocalDateTime> notificationTime;

    public Bank() {
        creditors = new HashMap<>();
        notificationTime = new HashMap<>();
    }

    public void addCreditor(Creditor creditor) {
        creditors.put(creditor.getIdNumber(), creditor);
        notificationTime.put(creditor.getIdNumber(), LocalDateTime.now());
    }

    public void sendNotification() {
        for (int idNumber : notificationTime.keySet()) {
            LocalDateTime time = notificationTime.get(idNumber);
            if (time.until(LocalDateTime.now(), ChronoUnit.DAYS) > 30) {
                Creditor creditor = creditors.get(idNumber);
                notificationTime.put(idNumber, LocalDateTime.now());

            }
        }
    }
}
