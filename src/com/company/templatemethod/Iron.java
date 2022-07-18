package com.company.templatemethod;

public class Iron extends ElectricDevice {

    @Override
    void switchOn() {
        System.out.println("The iron is switchOn");
    }

    @Override
    void switchOff() {
        System.out.println("The iron is switchOff");
    }

    @Override
    boolean isSwitchedOn() {
        return false;
    }
}
