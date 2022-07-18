package com.company.templatemethod;

public abstract class ElectricDevice {
    public void toggle()
    {
        if(isSwitchedOn())
        {switchOn();}
        else switchOff();

    }
    abstract void switchOn();
    abstract void switchOff();
    abstract boolean isSwitchedOn();
}
