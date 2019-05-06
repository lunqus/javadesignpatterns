package singletonDesingPattern;

public class MySingleton {

    // Lazily creating Singleton class
    private static MySingleton uniqueInstance;

    String name;

    private MySingleton() {
    }

    public static synchronized MySingleton getInstance() {
        // Adding the synchronized keyword makes singleton thread safe.

        if(uniqueInstance == null) {
            uniqueInstance = new MySingleton();
        }
        return uniqueInstance;
    }

}
