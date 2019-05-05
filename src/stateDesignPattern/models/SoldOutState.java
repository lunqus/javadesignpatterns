package stateDesignPattern.models;

public class SoldOutState implements State {

    SodaVendingMachine sodaVendingMachine;

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine sold out!");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Insert money first before ejecting");
    }

    @Override
    public void select() {
        System.out.println("No soda is available");
    }

    @Override
    public void dispence() {
        System.out.println("Sold out!");
    }

    @Override
    public String toString() {
        return "Sold out!";
    }
}
