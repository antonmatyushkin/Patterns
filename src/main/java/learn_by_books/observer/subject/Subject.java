package learn_by_books.observer.subject;

import learn_by_books.observer.elements.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
