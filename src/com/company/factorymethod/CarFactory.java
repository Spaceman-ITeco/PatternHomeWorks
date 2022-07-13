package com.company.factorymethod;

public class CarFactory {

    public Car getCar(CarType type)
    {
        Car car =null;
        switch (type){
            case JEEP -> {
                car = new JeepCar();
            }
            case SEDAN -> {
                car = new SedanCar();
            }
            default -> throw new IllegalArgumentException("Wrong cake type:" + type);
        }

        return car;
    }
}
