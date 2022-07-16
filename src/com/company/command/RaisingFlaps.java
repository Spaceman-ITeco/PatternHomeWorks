package com.company.command;

public class RaisingFlaps implements AircraftCommand{

    private int seconds;
    private int angle;

    public RaisingFlaps(int seconds, int angle) {
        this.seconds = seconds;
        this.angle = angle;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }

    @Override
    public int getNumber() {
        return angle;
    }
}
