package singletonDesingPattern;

public class MainSingleton {

    public static void main(String[] args) {

        MyClass myClass = MyClass.getInstance();
        myClass.name = "Class";

    }
}
