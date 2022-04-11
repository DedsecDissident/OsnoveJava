package com.company.lesson20;

public enum MusicEnum { // Перечисления
    ROCK(5,"rock"), POP(8,"pop"), CLASSIC(12,"classic"); //Набор констант (объектов) объединенных каким-либо смыслом

    private int i;
    private String name;

    MusicEnum(int i, String name) { //Когда мы создаём конструктор и добавляем в него поля, то эти поля относятся к объектам.
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
