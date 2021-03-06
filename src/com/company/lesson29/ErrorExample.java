package com.company.lesson29;

// При возникновении исключения во время работы программы создаётся объект описывающий это исключение. Выполнение...
// ... программы останавливается и начинается обработка данного исключения. В зависимости от типа исключения...
// ... программа может продолжить выполнение программы, либо остановить её выполнение.

// Глава иерархии исключений - это класс Throwable, а от него:
// ... 1) Error (СЕРЬЁЗНЫЕ!!! непроверяемые исключения): компилятор их не видит (как и мы)
// ... 2) Exception (проверяемые исключения): компилятор их видит, предлагает обработать.

// Есть независимые непроверяемые исключения - RuntimeException. Он, в свою очередь потомок класса Exception.
// Ответственность за обработку исключений данного типа лежит на РАЗРАБАХ, и может быть завершена без ущерба для проги.


public class ErrorExample {

    private ABC abc;

    public void foo(){
        // System.out.println(1/0);

        // int [] array = {1,2,3};
        // array [5] = 3;

        // Для проверки на ошибку в ходе работы и нужны исключения, чтобы не беспокоится о неправильном ходе работы.


        // Использование try/catch подобным образом УЖАСНО (ресурсоёмко), лучше уж if! Он нужен для обработки...
        // ... более сложных исключений.
        try { // "Попытайся выполнить"
//          abc.show(); //При попытке вызвать у ССЫЛКИ метод, конечно выводится ошибка
        } catch (NullPointerException e){ //Ищи эту ошибку в try, и заключи её в объекте "e"
            System.err.println("Нельзя вызывать метод у ссылки"); // err - выводит красное сообщение
            e.printStackTrace(); //Выводит подробности об исключении
        }


        // Лучше уж использовать так
        try { // Если одно из действий выведет исключение, то последующие действие выполняться не будет.
              // Начнется обработка ошибки и конец программы
//          abc.show();
            System.out.println(1/0);
        } catch (NullPointerException a){
            System.err.println("Нельзя вызывать метод у ссылки");
            a.printStackTrace();
        } catch (ArithmeticException b){
            System.err.println("Нельзя делить на ноль");
            b.printStackTrace();
        }


        // С JAVA7 появилась возможность объединения catch
        try {
//          abc.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException ab){
            System.err.println("Нельзя вызывать метод у ссылки");
            System.err.println("Нельзя делить на ноль");
            ab.printStackTrace();
        }
    }
}
