package DecoratorPattern;

/**
 * Created by nsmirosh on 5/2/2015.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
