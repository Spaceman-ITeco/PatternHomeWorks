package com.company.composite;

public class VolumeCalculator {
    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter(100);
        DataCenter dataCenter1 = new DataCenter(200);
        Server server = new Server(50);
        HardDrive hardDrive = new HardDrive(1);
        ServerRack serverRack = new ServerRack(17);
        Volume volume = new Volume(dataCenter,dataCenter1,server,hardDrive,serverRack);
        System.out.println(volume.getVolume());
    }
}
