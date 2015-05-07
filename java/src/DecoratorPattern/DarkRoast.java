package DecoratorPattern;

/**
 * Created by nsmirosh on 5/2/2015.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
