package com.company.lesson21_22;

public class Bird {
    public String name;

    public void walk(){ //Т.к. у нас есть 2 метода walk (в super и наследнике), но с разными параметрами, ...
                        //... то метод walk становится перегруженным. СТАТИЧЕСКИЙ ПОЛИМОРФИЗМ
        System.out.println("bird go");
    }

    public void eat(){ //Т.к. у нас 2 метода eat с одинаковыми принимающими значениями, ...
                       // ... то метод eat ПЕРЕОПРЕДЕЛЯЕТСЯ. ДИНАМИЧЕСКИЙ ПОЛИМОРФИЗМ
        System.out.println("Bird eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
