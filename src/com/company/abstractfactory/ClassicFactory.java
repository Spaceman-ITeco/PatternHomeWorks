package com.company.abstractfactory;

public class ClassicFactory implements BuildingFactory{
    @Override
    public House getHouse() {
        return new ClassicHouseBuilding();
    }

    @Override
    public School getSchool() {
        return new ClassicSchoolBuilding();
    }
}
