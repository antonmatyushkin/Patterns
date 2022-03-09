package observer.elements;

import observer.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    @Override
    public void display() {
        //Вывод прогноза
    }
}
