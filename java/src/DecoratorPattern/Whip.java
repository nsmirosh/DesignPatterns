package DecoratorPattern;

/**
 * Created by nsmirosh on 5/2/2015.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() +",Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}