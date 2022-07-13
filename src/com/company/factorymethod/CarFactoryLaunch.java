package com.company.factorymethod;

public class CarFactoryLaunch {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car sedan = carFactory.getCar(CarType.SEDAN);
        Car jeep = carFactory.getCar(CarType.JEEP);
        System.out.println(sedan.getClass().toString() + " " + sedan.getDateCreation());
        System.out.println(jeep.getClass().toString() + " " + jeep.getDateCreation());
    }
}
