package com.company;

import com.company.lesson11.OperatorSwitch;
import com.company.lesson14.MyArrays;
import com.company.lesson20.MusicEnum;
import com.company.lesson21_22.Bird;
import com.company.lesson21_22.Crow;
import com.company.lesson21_22.Ostrich;
import com.company.lesson21_22.Test;
import com.company.lesson28.BodyParts.*;
import com.company.lesson28.Robot;
import com.company.lesson29.ErrorExample;
import com.company.lesson30.PerimeterException;
import com.company.lesson30.PerimeterSquare;
import com.company.lesson32.Cat;
import com.company.lesson32.Serializator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        myArrays.foo();
    }
}

    // lesson 32
//        Cat cat = new Cat();
//        cat.setName("Tom");
//
//        Serializator serializator = new Serializator();
//        try {
//            cat=serializator.deserialization();
//            System.out.println(cat.getName());
//        } catch (InvalidObjectException e) {
//            e.printStackTrace();
//        }
//    }
//}


        // lesson31 Потоки ввода вывода (I/O)

        // ЧТЕНИЕ ПОТОКОВ
//
//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        int b=0;
//
//        try {
//            fis = new FileInputStream("D:/1.txt"); // FileInputStream - байтовый поток.
//                                                          // Обработка try/catch НУЖНА, т.к. ...
//                                                          //... компилятор не проверяет конечный адрес файла.
//            isr = new InputStreamReader(fis, "UTF-8"); // Символьный поток, старший родственник FIS
//            while ((b=isr.read())!=-1) {
//                System.out.print((char)b);
//            };       // Метод read возвращает 1 byte из нашего файла, а чтобы прочитать его целиком, ...
//                     // ... мы поместим его в цикл while, когда чтение достигнет -1, то чтение файла закончено.
//                     // Так же его нужно обработать try/catch для того, чтобы при одновременном чтении файла ...
//                     // ... его исчезновения из системы (Например: вытаcкивании флешки с доком) не возникало вопросов.
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {  // ЗАКРЫТИЕ ПОТОКОВ ОБЯЗАТЕЛЬНО!!! Для каждого потока отдельный try/catch, во избежание ошибок.
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                isr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // ЗАПИСЬ ПОТОКОВ
////        FileOutputStream fileOutputStream = null;
////        FileWriter fileWriter = null;
//        FileWriter fileWriter2 = null;
//        String str="Fuck you, motherfucker!";
//        try {
////            fileWriter = new FileWriter("D:/1.txt");//2)К старому содержимому файла добавляется новое.
//            fileWriter2 = new FileWriter("D:/1.txt",false);//2) К тому же можно выбирать: добавить...
//                                                                         //2) ... (true) или обновить инфу (false).
////            fileOutputStream = new FileOutputStream("D:/1.txt");//1)Файл перезаписывается предварительно очищаясь.
////            fileOutputStream.write(str.getBytes());
////            fileWriter.write();
//            fileWriter2.write(str);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fileWriter2.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


    //lesson31
//        PerimeterSquare perimeterSquare = new PerimeterSquare();
//        try {
//            perimeterSquare.getPerimeter("g");
//        } catch (PerimeterException e) {
//            e.printStackTrace();
//        }
//    }
//}

    //lesson29
//        ErrorExample errorExample = new ErrorExample();
//        try {
//            FileInputStream fileInputStream = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally { //Выполнит весь блок действий; В основном используется в работе с потоками.
//
//        }
//    }
//}

    //lesson28
//        Body body=new Body();
//
//        SmallHead smallHead = new SmallHead();
//        MediumHead mediumHead = new MediumHead();
//        BigHead bigHead = new BigHead();
//        Leg leg = new Leg();
//
//        Robot<SmallHead> robot1 = new Robot<SmallHead>(body,smallHead); //При создании объекта компилятор заменяет все...
//                                                                        //... фиктивные типы (T) на реальные (SmallHead)
//        Robot<BigHead> robot2 = new Robot<BigHead>(body,bigHead);
//        robot1.getHead().burn();
//        robot2.getHead().turn();
//
//        // robot1=robot2;           // Нельзя присвоить адреса друг другу, как раньше - объекты созданы на основе одного класса...
//                                    // ... но из-за параметров, классы видоизменяются в ходе создания объектов, а именно поля.
//
//                                    // Так же если создать объект типа Robot, но не указать параметры, то по умолчанию...
//                                    // ... будет выставлен параметр Object, т.к. параметр нельзя не указывать.
//
//        //Robot robot = new Robot(body,leg); // Мы видим, что вместо поля (T), мы можем вставлять, ЛЮБОЙ тип и компилятору будет норм.
//                                             // То есть мы создали head типа Leg, что само собой - бред
//        // СПАСАЕМ ПОЛОЖЕНИЕ написав в Robot параметр <T extends Head> и всё будет круто, т.к. мы сделали ограничение.
//
//        robot1.<smallHead,smallHead>foo()(smallHead,smallHead)
//    }
//}



    // lesson27
//        // StringBuilder работает быстрее, но НЕ является потока-безопасным.
//        // StringBuffer работает медленнее, но является потока-безопасным.
//        // ВНИМАНИЕ! String отличается от StringBuilder/Buffer тем, что объекты String становятся прежними после осуществления метода.
//
//        StringBuilder stringBuilder = new StringBuilder("Big "); // При создании объекта StringBuilder/Buffer конструктор по...
//                                                                 // ... умолчанию автоматом резервирует объём памяти (capasity) под 16 символов.
//
//        stringBuilder.toString();                                       // Метод класса Object - приведение метода к строке.
//        stringBuilder.ensureCapacity(17);                 // Установление мин. гарантированного размера памяти.
//        stringBuilder.append("Brother, let go to play computer games"); // Добавление переменной в объект.
//        stringBuilder.setLength(42);                                    // Установление символьного размера объекта.
//        System.out.println(stringBuilder.capacity());
//        stringBuilder.insert(2,"666");                        // Вклинивание символа в указанную позицию (смещая правую часть в бок).
//        stringBuilder.delete(0,3);                                      // Удаление куска строки (начало/конец).
//        stringBuilder.deleteCharAt(0);                                  // Удаление символа по индексу.
//        stringBuilder.reverse();                                        // Строка ЗАДОМ-НАПЕРЕД
//        System.out.println(stringBuilder);
//    }
//}


     // lesson 26
//        String string = new String("Original");
//        String string1 = "Original 2";
//        System.out.println(string.charAt(0)); //Вернёт символ "O" от "Original".
//        System.out.println(string.codePointAt(0));          // Возвращает число в кодировке Unicode согласно данному символу.
//        System.out.println(string.compareTo(string1));           // Возвращает разницу между символами строк, если разницы нет, то выведет 0.
//        System.out.println(string.compareToIgnoreCase(string1)); // Делает то же что и предыдущий метод, но невзирая на регистр.
//        System.out.println(string.concat(string1));              // Обеспечивает слияние двух строк.
//        System.out.println(string.equals(string1));              // Сравнение СОДЕРЖИМОГО объектов (TRUE/FALSE).
//        System.out.println(string.equalsIgnoreCase(string1));    // Сравнение СОДЕРЖИМОГО объектов (TRUE/FALSE) без учёта регистра.
//        System.out.println(string.hashCode());                   // Выводит на экран индивидуальный HASHCODE объекта.
//        System.out.println(string.indexOf(79));                  // Возвращает индекс символа (в кодировке unicode).
//        System.out.println(string.isEmpty());                    // Возвращает TRUE - если строка пустая, FALSE - в ином случае.
//        System.out.println(string.length());                     // Возвращает длину строки.
//
//        String[] strings = string1.split(" ");             // Принимает строку-разделитель, после чего возвращает массив STRING-ов.
//        for (String element : strings) {
//            System.out.println(element);
//        }
//
//        System.out.println(string.substring(2, 5));             // Возвращает КУСОК строку (обозначаются index-начало/конец нужного куска).
//        char[] charArray = string.toCharArray();                //Разбитие строки на массив символов.
//        for (char element : charArray) {
//            System.out.println(element);
//        }
//
//        System.out.println(string.toLowerCase());               // Возвращает строку, делая все регистры нижними.
//        System.out.println(string.toUpperCase());               // Возвращает строку, делая все регистры верхними.
//        System.out.println(string.trim());                      //Возвращает строку с обрезанными пробелами перед и после строки.
//    }
//}

    //lesson20
//        MusicEnum musicEnum1 = MusicEnum.CLASSIC;
//        MusicEnum musicEnum2 = MusicEnum.valueOf(MusicEnum.class, "ROCK"); //
//
//        for (MusicEnum element : MusicEnum.values()) { //VALUES возвращает массив элементов находящихся в Enum, ...
//            //... который мы перебираем for-ом
//            System.out.println(element);
//        }
//
//        switch (musicEnum1) {
//            case POP:
//                System.out.println("POP");
//                break;
//            case ROCK:
//                System.out.println("ROCK");
//                break;
//            case CLASSIC:
//                System.out.println("CLASSIC");
//                break;
//        }
//    }
//}

//    //lesson21_22
//        Ostrich ostrich = new Ostrich();
//        Crow crow = new Crow();
//
//        ostrich.setName("Пороро");
//        crow.setName("Каркуша");
//
//        Bird crow2 = new Crow();
//        crow2.setName("Паровозов");
//
//        crow.walk();
//        crow.walk("LOL");
//        crow.eat();
//
//        Test test = new Test();
//        test.foo(ostrich);
//        //crow2 создана птицей, а не вороной, при этом относящаяся к воронам
//    }
//}

    //lesson19
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.setA(10);
//        System.out.println(encapsulation.foo());
//        System.out.println(encapsulation.getA());
//    }
//}

    //lesson20
//        //2 способа создания объекта ENUM
//        MusicEnum musicEnum1 = MusicEnum.CLASSIC;
//        MusicEnum musicEnum2 = MusicEnum.valueOf(MusicEnum.class,"ROCK"); //
//
//        for (MusicEnum element : MusicEnum.values()) { //VALUES возвращает массив элементов находящихся в Enum, ...
//                                                       //... который мы перебираем for-ом
//            System.out.println(element);
//        }
//
//        System.out.println(musicEnum1);
//        System.out.println(musicEnum2);
//
//        System.out.println(musicEnum1.ordinal());//Позиция объекта в Enum
//
//        switch (musicEnum1){
//            case CLASSIC:
//                System.out.println("classic");
//                break;
//            case ROCK:
//                System.out.println("rock");
//                break;
//            case POP:
//                System.out.println("pop");
//                break;
//        }
//
//        System.out.println(musicEnum1.getI());
//    }
//}

     //lesson17-18
//        Bus bus = new Bus();
//        bus.go("Вперед!");
//        int km = bus.showKM(80);
//        System.out.println(km);
//
//        Transmission transmission1 = new Transmission();
//        Transmission transmission2 = new Transmission();
////       transmission1.variable = 6; //Не корректно
////       transmission2.variable = 2; //Не корректно
//        Transmission.variable = 2; //корректно, т.к. static поля напрямую принадлежат классу
//        System.out.println(transmission1.variable);
//        System.out.println(transmission1.variable);
//    }
//}

    //lesson14
//        FOR Bubble = new FOR();
//        int[] Sort = {1,3,0,2,6,5,9,7,8,4};
//        Bubble.BubbleSort(Sort);
//    }
//}
