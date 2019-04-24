package singletonDesingPattern;

public class MySingleton {

    private static MySingleton uniqueInstance = new MySingleton();

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
