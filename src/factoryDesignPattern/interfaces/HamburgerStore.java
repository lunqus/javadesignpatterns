package factoryDesignPattern.interfaces;

import factoryDesignPattern.model.Hamburger;

public abstract class HamburgerStore {

//    SimpleHamburgerFactory factory;

//    public HamburgerStore(SimpleHamburgerFactory factory) {
//        this.factory = factory;
//    }

    public Hamburger orderHamburger(String type) {
        Hamburger burger;

        //We now user our factory. Not the if statement
        burger = createHamburger(type); //factory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

    abstract public Hamburger createHamburger(String type);
}
