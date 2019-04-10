package factoryDesignPattern;

import factoryDesignPattern.interfaces.HamburgerStore;
import factoryDesignPattern.model.*;

public class Main {

    public static void main(String[] args) {

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();

        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("ordered: " + hamburger.getName());

        System.out.println("-------");
        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("ordered: " + hamburger.getName());

    }
}
