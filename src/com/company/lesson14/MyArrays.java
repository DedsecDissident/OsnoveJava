package com.company.lesson14;

public class MyArrays {

    Apple [] basket = new Apple[5]; // Ссылочный тип массива
    String [] array1 = new String[10]; // Примитивный тип массива
    String [] array2;
    String [] array3 = {"польза","ложь","вред","правда"};

    Apple greenApple = new Apple();
    Apple redApple = new Apple();
    Apple yellowApple = new Apple();

    Apple [] basket1 = {greenApple,redApple,yellowApple};

    public void foo(){
        // #1
        for (int i=0; i<basket1.length; i++){ // Простой вывод массива в консоль
            System.out.println(basket1[i]);
        }

        // #2
        int [] array = new int [3]; // Почему выводится "0", а не "null"? Потому, что "установка значений по умолчанию".
        System.out.println(array[1]);

        // #3
        int [][][] satan = new int[3][3][3]; // Многомерные массивы
        int [][][] jesus = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}}; // кубик чисел
        // Инструкция [выбор линии][выбор раздела линии][выбор числа линии]
        System.out.println(jesus[1][2][1]); // Следовательно выйдет 8
    }
}
