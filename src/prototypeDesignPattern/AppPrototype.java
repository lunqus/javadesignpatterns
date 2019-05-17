package prototypeDesignPattern;

public class AppPrototype {

    public static void main(String[] args) {

        Person bonni = new Person("Bonni", 21);
        System.out.println("Person 1: " + bonni);

        Person nina = (Person) bonni.clone();
        nina.setName("Nina");
        System.out.println("Person 2: " + nina);

        Dolphin jerry = new Dolphin("Jerry", 78);
        System.out.println("Dolphin 1: " + jerry);

        Dolphin sam = (Dolphin) jerry.clone();
        sam.setName("Sam");
        System.out.println("Dolphin 2: " + sam);


        prototypeDesignPattern.cloneableInterface.Person modelPerson = new prototypeDesignPattern.cloneableInterface.Person("James", 45);
        System.out.println("Person 1: " + modelPerson);

        prototypeDesignPattern.cloneableInterface.Person Person2 = (prototypeDesignPattern.cloneableInterface.Person) modelPerson.clone();
        System.out.println("Person 2: " + Person2);

        System.out.println(System.identityHashCode(modelPerson) + " \n" +
                System.identityHashCode(Person2));
    }
}
