package observer.subject;

import observer.elements.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
