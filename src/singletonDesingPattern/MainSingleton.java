package singletonDesingPattern;

import java.nio.file.Watchable;

public class MainSingleton {

    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();

        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton secondSingleton = MySingleton.getInstance();

        mySingleton.name = "Class";
        System.out.println("========");
        System.out.println("Lazily  I: " + mySingleton);
        System.out.println("Lazily II: " + secondSingleton); // Has same address like previous because singleton
        System.out.println("========");
        System.out.println("Object person 1: " + person);
        System.out.println("Object person 2: " + person1); // Has different address

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println("========");
        System.out.println("Eagerly  I: " + eagerSingleton);
        System.out.println("Eagerly II: " + eagerSingleton1);

        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton doubleCheckLockingSingleton1 = DoubleCheckLockingSingleton.getInstance();
        System.out.println("========");
        System.out.println("Double check Singleton   I: " + doubleCheckLockingSingleton);
        System.out.println("Double check Singleton  II: " + doubleCheckLockingSingleton1);
    }
}
