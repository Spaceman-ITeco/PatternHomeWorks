package com.company.observer;

import java.time.LocalDate;

public interface Observable {
    void addObserver(Observer o, LocalDate localDate);
    void deleteObserver(int i);
    void sendNotifications();
}
