package com.company.templatemethod;

public class ElectricDeviceLaunch {
    public static void main(String[] args) {
        ElectricDevice iron = new Iron();

        iron.isSwitchedOn();
        iron.toggle();
    }
}
