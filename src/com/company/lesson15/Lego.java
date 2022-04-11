package com.company.lesson15;

public class Lego {
    String name,color;

    public Lego(){} //Такой конструктор создаётся по умолчанию компилятором, не учитывая слово super (имя как у класса)
    public Lego(String myColor, String myName){   //Типичный пример конструктора
        name = myName;
        color = myColor;
    }
}
