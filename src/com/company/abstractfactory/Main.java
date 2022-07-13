package com.company.abstractfactory;

public class Main {
    public static void main(String[] args) {
        BuildingFactory buildingFactory = new ClassicFactory();
        buildingFactory.getHouse();
        buildingFactory.getSchool();

    }
}
