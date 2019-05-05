package stateDesignPattern;

import stateDesignPattern.models.SodaVendingMachine;

public class TestMainState {

    public static void main(String[] args) {

        SodaVendingMachine svm = new SodaVendingMachine(10);

        System.out.println(svm);

        svm.insertMoney();
        svm.selectSoda();

        System.out.println(svm);

        svm.insertMoney();
        svm.selectSoda();

        svm.insertMoney();
        svm.selectSoda();

        System.out.println(svm);

    }
}
