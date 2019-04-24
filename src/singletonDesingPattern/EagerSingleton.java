package singletonDesingPattern;

public class EagerSingleton {

    // Eagerly creating Singleton class
    private static EagerSingleton uniqueEagerInstance = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return uniqueEagerInstance;
    }
}
