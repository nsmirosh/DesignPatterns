package SingletonPattern;

/**
 * Created by nsmirosh on 5/23/2015.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    public static ChocolateBoiler chocolateBoiler;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
// fi ll the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
// drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
// bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
