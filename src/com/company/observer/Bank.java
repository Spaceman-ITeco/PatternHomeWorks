package com.company.observer;

import java.time.LocalDate;
import java.util.*;

public class Bank implements Observable{

    private List<Creditor> observers=new ArrayList<>();;
    private Map<Creditor,LocalDate> eventMap = new HashMap<>();

    @Override
    public void addObserver(Observer o, LocalDate localDate) {
        observers.add((Creditor) o);
        eventMap.put((Creditor) o, localDate);
    }

    @Override
    public void deleteObserver(int id) {


        for (int i = 0; i < observers.size(); i++) {
            Creditor creditor = observers.get(i);
            if(creditor.getIdNumber()==id)
            {
                eventMap.remove(creditor);
                observers.remove(i);
              }
        }

    }

    @Override
    public void sendNotifications() {
       LocalDate localDateMinusMonth = LocalDate.now().minusMonths(1);
        for (int i = 0; i < eventMap.size(); i++)
        {
            Creditor creditor = observers.get(i);
            LocalDate addedLocalDate = eventMap.get(creditor);
            if(addedLocalDate.isBefore(localDateMinusMonth))
            {creditor.handle(" You have a debt in the bank for more than a month");}
        }
        }

    public void sendNotificationsForAll() {
        observers.forEach(observer -> observer.handle("You have a debt in the bank"));
    }

}

