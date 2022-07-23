package com.company.prototype;



public class OrderPrototypePSVM {
    public static void main(String[] args) {
        Order order = new Order();
        Product product = new Product("cap",400);
        order.addProduct(product,1);
        Product product1 = new Product("pen",100);
        order.addProduct(product1,2);
        Order order1 = (Order) order.getCopy();
       System.out.println(order1.toString());


    }
}
