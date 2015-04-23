package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0F;
    private float minTemp = 200.0F;
    private float tempSum = 0.0F;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp;
        ++this.numReadings;
        if(temp > this.maxTemp) {
            this.maxTemp = temp;
        }

        if(temp < this.minTemp) {
            this.minTemp = temp;
        }

        this.display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + this.tempSum / (float)this.numReadings + "/" + this.maxTemp + "/" + this.minTemp);
    }
}