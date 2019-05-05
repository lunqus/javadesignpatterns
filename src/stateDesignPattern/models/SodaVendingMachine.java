package stateDesignPattern.models;

public class SodaVendingMachine {
    private State soldOutState;     // Soda is out of order
    private State noMoneyState;     // Soda vending machine didn't receive any money yet
    private State hasMoneyState;    // Soda vending machine already has money
    private State soldState;        // Soda is paid and actualy supplying

    private State state = soldOutState;
    private int count = 0;

    public SodaVendingMachine(int numberOfSodas) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);

        count = numberOfSodas;

        if (numberOfSodas > 0) {
            state = noMoneyState;
        }
    }

    // Actions
    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void selectSoda() {
        state.select();
    }

    public void dispense() {
        state.dispence();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThe Soda Machine, Co");
        result.append("\nInventory: " + count + " soda");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Soda Vending Machine is " + state + "\n");

        return result.toString();
    }
}
