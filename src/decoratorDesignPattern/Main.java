package decoratorDesignPattern;

import decoratorDesignPattern.interfaces.IceCream;
import decoratorDesignPattern.model.BasicIceCream;
import decoratorDesignPattern.model.ChocolateIceCream;
import decoratorDesignPattern.model.MintIceCream;
import decoratorDesignPattern.model.VanillaIceCream;

public class Main {

    public static void main(String[] args) {

        // (L) Emulating person who goes to IceCream shop (adding choco or nuts ...)

        // (L) Here we using the IceCream interface and it's a power of Polymothism, because all clases connected to this interface
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cream cost $" + basicIceCream.cost());
        System.out.println("----------");

        // (L) Add Vanilla to the order
        IceCream vanillaIceCream = new VanillaIceCream(basicIceCream); // (L) Wrapping bacicIceCream with Vanilla
        System.out.println("Adding Vanilla $" + vanillaIceCream.cost());
        System.out.println("----------");

        // (L) Add Chocolate to the order
        IceCream chocolateIceCream = new ChocolateIceCream(vanillaIceCream);
        System.out.println("Adding Chocolate to Basic $" + chocolateIceCream.cost());
        System.out.println("----------");

        // (L) Add Mint to the order
        IceCream mintIceCream = new MintIceCream(chocolateIceCream);
        System.out.println("Adding Chocolate to Vanilla $" + mintIceCream.cost());
    }
}
