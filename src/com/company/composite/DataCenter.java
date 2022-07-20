package com.company.composite;

public class DataCenter implements Storage{
    private final int volume;

    public DataCenter(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
