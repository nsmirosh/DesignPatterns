package FactoryPattern.FactoryMethod;

/**
 * Created by nsmirosh on 5/6/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
