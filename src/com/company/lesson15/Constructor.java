package com.company.lesson15;

//Конструктор - своего рода метод используемый при создании объекта

public class Constructor { // Конструктор необходим для инициализации полей объекта
    public void foo(){
        Lego lego1 = new Lego(); //Здесь мы используем конструктор по умолчанию: Lego ()
        lego1.name=("Витёк");
        lego1.color=("Чёрный");

        Lego lego2 = new Lego("Белый","Майкл"); //Присваивание имён при помощи конструктора: Lego (str, str)
        System.out.println(lego1.name+" "+lego1.color);
    }
}
