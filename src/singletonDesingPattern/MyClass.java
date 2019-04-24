package singletonDesingPattern;

public class MyClass {

    private static MyClass uniqueInstance;

    String name;

    private MyClass() {
    }

    public static MyClass getInstance() {

        if(uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;
    }

}
