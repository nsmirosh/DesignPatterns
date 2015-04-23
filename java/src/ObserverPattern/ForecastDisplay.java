package ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92F;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        this.display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if(this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if(this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if(this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }
}