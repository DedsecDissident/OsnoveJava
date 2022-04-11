package com.company.lesson21_22;

public class Crow extends Bird{

    public String voice="Кар! гет аут оф ве кар!";

    public void fly(){
        System.out.println("Crow flies");
    }

    public void walk(String str){
        System.out.println("walk"+str);
    }

//    public void eat(){
//        System.out.println("Crow eat");
//    }


    @Override
    public void eat() { //Повторение предыдущего метода через Override Methods
        System.out.println("Eat Crow");
    }
}
