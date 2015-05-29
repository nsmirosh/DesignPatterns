package SingletonPattern;

import sun.rmi.runtime.Log;

/**
 * Created by nsmirosh on 5/23/2015.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables here
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
// other useful methods here
}
