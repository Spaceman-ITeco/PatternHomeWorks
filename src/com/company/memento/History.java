package com.company.memento;


import java.time.LocalDateTime;
import java.util.HashMap;

public class History {
    private HashMap<LocalDateTime,OrderMemento> mementoHashMap = new HashMap<>();
    public void add(OrderMemento memento)
    {System.out.println("Document saving");
    this.mementoHashMap.put(memento.getChangeTime(),memento);}
    public OrderMemento rollback(LocalDateTime changeTime){
        System.out.println("rollback last operations");
        return this.mementoHashMap.get(changeTime);
    }
}
