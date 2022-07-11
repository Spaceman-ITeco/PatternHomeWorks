package com.company.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ObserverLaunch {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Creditor creditor = new Creditor(1,"Ivan");
        Creditor creditor1 = new Creditor(2, "John");
        Creditor creditor2 = new Creditor(3, "Yury");
        bank.addObserver(creditor, LocalDate.of(2022,7,6));
        bank.addObserver(creditor1,LocalDate.of(2022,2,23));
        bank.addObserver(creditor2,LocalDate.of(2022,7,6));
        bank.deleteObserver(3);
        bank.sendNotifications();
        System.out.println();
        bank.addObserver(creditor2, LocalDate.of(2022,6,9));
        bank.sendNotifications();
        System.out.println();
        bank.sendNotificationsForAll();
    }
}
