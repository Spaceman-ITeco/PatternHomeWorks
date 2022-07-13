package com.company.abstractfactory;

public class ModernFactory implements BuildingFactory{
    @Override
    public House getHouse() {
        return new ModernHouseBuilding();
    }

    @Override
    public School getSchool() {
        return new ModernSchoolBuilding();
    }
}
