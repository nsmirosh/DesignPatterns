package ObserverPattern;

/**
 * Created by nsmirosh on 4/23/2015.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
