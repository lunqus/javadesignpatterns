package stateDesignPattern.models;

public class HasMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public HasMoneyState (SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert another dollar bill");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Returning you dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());

    }

    @Override
    public void select() {
        System.out.println("Selected item ... ");
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
    }

    @Override
    public void dispence() {
        System.out.println("No soda dispensed");
    }

    @Override
    public String toString() {
        return "Waiting to a new selection...";
    }
}
