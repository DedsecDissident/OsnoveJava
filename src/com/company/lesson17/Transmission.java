package com.company.lesson17;

public class Transmission { //static - всё что затрагивает этот модификатор, принадлежит напрямую классу, а не объектам класса
                            //static эл-ты не видят эл-ты объектов, Но данные объектов видят данные static...
                            //Класс не воспринимает индивидуальность, а объекты воспринимают общность.
    public String type1;
    public static String type2;

    public static int variable; //Все поля static являются общими для всех объектов

    public static void showType(){
        //System.out.println(type1); //static метод не видит поля принадлежащие объектам класса
        System.out.println(type2);   //Видны лишь другие static элементы. Т.к. поля объектов индивидуальны
    }
}
