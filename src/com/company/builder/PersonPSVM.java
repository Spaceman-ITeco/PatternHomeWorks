package com.company.builder;

public class PersonPSVM {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .name("Irina")
                .login("Irina")
                .password("123456")
                .build();
        System.out.println("Name "+ person.getName()+" Login "+person.getLogin()+" password "+person.getPassword());
        Person full = new Person.PersonBuilder()
                .name("Sergey")
                .login("Sergey")
                .password("333222")
                .birthYear(1967)
                .cityName("Kiev")
                .address("Bankovskaya 14 flat 11")
                .build();
        System.out.println("Name "+ full.getName()+" Login "+full.getLogin()+" password "+full.getPassword()
        + " Birth year " +full.getBirthYear()+ " city name " + full.getCityName()+ " address " + full.getAddress());


    }
}
