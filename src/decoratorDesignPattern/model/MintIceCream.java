package decoratorDesignPattern.model;

import decoratorDesignPattern.interfaces.IceCream;

public class MintIceCream extends IceCreamDecorator {

    // (L) Matching constructor to invoke parent and pass an IceCream type to initialize the object
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        // (L) Returns the super costs from IceCreamDecorator and adds ChocolateIceCream costs
        return 1.5 + super.cost();
    }
}
