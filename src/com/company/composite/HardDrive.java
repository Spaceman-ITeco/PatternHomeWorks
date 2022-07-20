package com.company.composite;

public class HardDrive implements Storage{
    private final int volume;

    public HardDrive(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
