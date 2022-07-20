package com.company.composite;

public class ServerRack implements Storage{
    private final int volume;

    public ServerRack(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
