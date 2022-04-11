package com.company.lesson16;

//public - класс и его составляющие, с этим модификатором, будут доступны всей внешней среде класса
//private - НЕПРИНИМ К ОБЫЧНОМУ КЛАССУ (ТОЛЬКО К ВЛОЖЕННЫМ КЛАССАМ И МЕТОДАМ)!
//default - работает как public, отличаясь лишь тем, что класс и его поля видны лишь в определенном package;
//          для объявления default - нужно оставить их без модификатора доступа. Например: void foo(){}
//                                                                                         class Modifiers{}
//protected - работает по принципу default, исключая схожесть работы с наследованием - помогая обращаться классам-...
//            ...наследникам к полям и методам родительского класса, независимо от адреса пакета.

public class Modifiers {
    public Modifiers(){}
    private String name;
    public int number;

    private class FirstClass {
        public String color;
    }

    private static void foo(){
//        FirstClass firstClass = new FirstClass(); //Закрытый класс нельзя помещать в static (исполняющий метод класса)
//        System.out.println(firstClass.color);

        Modifiers modifiers = new Modifiers(); //Так можно создать объект класса, в main, без ключевого слова new.
    }

    public void show(){
        foo();
    }



    protected class Watch{

    }
}