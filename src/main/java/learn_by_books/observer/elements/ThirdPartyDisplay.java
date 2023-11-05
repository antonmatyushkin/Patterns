package learn_by_books.observer.elements;

import learn_by_books.observer.subject.Subject;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }


    @Override
    public void display() {
        //Вывод другой информации на основании полученных данных

    }
}
