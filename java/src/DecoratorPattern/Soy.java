package DecoratorPattern;

/**
 * Created by nsmirosh on 5/2/2015.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() +",Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}