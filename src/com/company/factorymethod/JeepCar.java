package com.company.factorymethod;

import java.time.LocalDateTime;

public class JeepCar implements Car{
    @Override
    public int getWeight() {
        return 3000;
    }

    @Override
    public LocalDateTime getDateCreation() {
        return LocalDateTime.now().minusMonths(2);
    }

    @Override
    public double engineCapacity() {
        return 3000;
    }
}
