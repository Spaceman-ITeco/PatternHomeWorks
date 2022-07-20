package com.company.composite;

public class Server implements Storage{
    private final int volume;

    public Server(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
