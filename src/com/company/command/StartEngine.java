package com.company.command;

public class StartEngine implements AircraftCommand{

    private int seconds;
    private int turnover;

    public StartEngine(int seconds, int turnover) {
        this.seconds = seconds;
        this.turnover = turnover;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }

    @Override
    public int getNumber() {
        return turnover;
    }
}
