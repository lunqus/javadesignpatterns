package singletonDesingPattern;

import java.nio.file.Watchable;

public class MainSingleton {

    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();

        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton secondSingleton = MySingleton.getInstance();

        mySingleton.name = "Class";

        System.out.println(mySingleton);
        System.out.println(secondSingleton); // Has same address like previous because singleton

        System.out.println("Object person: " + person);
        System.out.println("Object person: " + person1); // Has different address

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton);
        System.out.println(eagerSingleton1);

        DoubleCheckLockingSingleton doubleCheckLockingSingleton = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton doubleCheckLockingSingleton1 = DoubleCheckLockingSingleton.getInstance();

        System.out.println(doubleCheckLockingSingleton);
        System.out.println(doubleCheckLockingSingleton1);
    }
}
