package decoratorDesignPattern.model;

import decoratorDesignPattern.interfaces.IceCream;

public class IceCreamDecorator implements IceCream {

    // (L) Instance variable for composition
    private IceCream iceCream;

    // (L) Initialazing the iceCream handle that we created
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        // (L) Returning cost of the iceCream that we're passing in our constructor
        return this.iceCream.cost();
    }
}
