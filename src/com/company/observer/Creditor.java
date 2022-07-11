package com.company.observer;

public class Creditor implements Observer{

    private final int idNumber;
    private final String name;

    public Creditor(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }



    @Override
    public void handle(String message) {
        System.out.printf("Dear " + getName() + " " + message +"\n");
    }
}
