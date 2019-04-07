package decoratorDesignPattern.model;

import decoratorDesignPattern.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream(){
        System.out.println("Creating basic Ice-Cream!");
    }

    @Override
    public double cost() {
        // (L) Because it's a basicIceCream - fix a basic price (cost)
        return 0.50;
    }
}
