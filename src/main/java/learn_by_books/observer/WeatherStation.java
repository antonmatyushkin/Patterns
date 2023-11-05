package learn_by_books.observer;

import learn_by_books.observer.elements.CurrentConditionsDisplay;
import learn_by_books.observer.elements.ForecastDisplay;
import learn_by_books.observer.elements.StatisticsDisplay;
import learn_by_books.observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(27.1f, 65f, 745f);
        weatherData.setMeasurements(26.6f, 70f, 744f);
        weatherData.setMeasurements(28.2f, 80f, 745f);

        currentDisplay.display();
        statisticsDisplay.display();
    }
}
