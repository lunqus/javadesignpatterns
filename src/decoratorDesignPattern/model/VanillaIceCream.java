package decoratorDesignPattern.model;

import decoratorDesignPattern.interfaces.IceCream;

public class VanillaIceCream extends IceCreamDecorator {

    // (L) Matching constructor to invoke parent and pass an IceCream type to initialize the object
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        // (L) Returns the super costs from IceCreamDecorator and adds ChocolateIceCream costs
        return 1.2 + super.cost();
    }
}
