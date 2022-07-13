package com.company.factorymethod;

import java.time.LocalDateTime;

public class SedanCar implements Car{
    @Override
    public int getWeight() {
        return 2100;
    }

    @Override
    public LocalDateTime getDateCreation() {
        return LocalDateTime.now().minusMonths(1);
    }

    @Override
    public double engineCapacity() {
        return 1800;
    }
}
