package factoryDesignPattern.model;

import factoryDesignPattern.interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        } else if (type.equals("Veggie")) {
            return new JamaicanVeggieBurger();
        } else return null;
    }
}
