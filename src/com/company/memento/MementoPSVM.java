package com.company.memento;

import java.time.LocalDateTime;

public class MementoPSVM {
    public static void main(String[] args) throws InterruptedException {
        Order order = new Order();
        Product product = new Product("cap",400);
        History history = new History();
        order.addProduct(product,1);
        order.save();
        history.add(order.save());
        System.out.println(order.getChangeTime());
        Thread.sleep(10);
        LocalDateTime changeTime = LocalDateTime.now();
        Product product1 = new Product("pen",100);
        order.addProduct(product1,2);
        order.save();
        Thread.sleep(10);
        LocalDateTime changeTime1 = LocalDateTime.now();
        Product product2 = new Product("spoon",300);
        order.addProduct(product2,1);
        order.save();
        history.add(order.save());
        System.out.println(order.getChangeTime());
        order.load(history.rollback(changeTime1));
        order.save();
        System.out.println(order.getChangeTime());
    }
}
