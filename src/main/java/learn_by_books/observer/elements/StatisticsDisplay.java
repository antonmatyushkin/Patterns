package learn_by_books.observer.elements;

import learn_by_books.observer.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float averageTemperature = 0;
    private float averageHumidity = 0;
    private float averagePressure = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.averageTemperature += temperature;
        this.averageHumidity += humidity;
        this.averagePressure += pressure;
        display();
    }

    @Override
    public void display() {
        //Вывод статистики
        System.out.println("Statistic conditions: " + averageTemperature + "С degrees and " + averageHumidity + "% humidity and " + averagePressure + " mmHg.");
    }
}
