package com.company.factorymethod;

import java.time.LocalDateTime;

public interface Car {
    int getWeight();
    LocalDateTime getDateCreation();
    double engineCapacity();
}
