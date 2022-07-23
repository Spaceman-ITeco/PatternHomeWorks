package com.company.builder;

public class Person {
    private String name;
    private String login;
    private String password;
    private int birthYear;
    private String cityName;
    private String address;

    public Person() {
        name = null;
        login = null;
        password = null;
        birthYear = 0;
        cityName = null;
        address = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static class PersonBuilder
    {
        private String name;
        private String login;
        private String password;
        private int birthYear;
        private String cityName;
        private String address;

        public PersonBuilder name(String bName){
            this.name=bName;
            return this;}

        public PersonBuilder login(String bLogin) {
            this.login=bLogin;
            return this;}

        public PersonBuilder password(String bPassword){
            this.password = bPassword;
            return this;
        }

        public PersonBuilder birthYear(int bBirthYear) {
            this.birthYear=bBirthYear;
            return this;}

        public PersonBuilder cityName(String bCityName)
        {this.cityName=bCityName;
        return this;}

        public PersonBuilder address(String bAddress) {
            this.address=bAddress;
            return this;}

  public Person build()
  {return new Person(this);}
    }

    private Person( PersonBuilder b)
    {this.name= b.name;
     this.login= b.login;
     this.password= b.password;
     this.birthYear=b.birthYear;
    this.cityName= b.cityName;
    this.address= b.address;}
}
