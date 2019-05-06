package singletonDesingPattern;

public class EagerSingleton {

    // Eagerly creating Singleton class
    private static EagerSingleton uniqueEagerInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return uniqueEagerInstance;
    }
}
