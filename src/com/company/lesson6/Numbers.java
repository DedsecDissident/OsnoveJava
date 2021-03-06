package com.company.lesson6;

public class Numbers {

    //Примитивные типы переменных

    //Целочисленные типы
    byte a=1;     //Имеет размер 1 байт (8 бит);   2^8 = 256                         (от -128 до 127)
    short b=2;    //Имеет размер 2 байт (16 бит);  2^16 = 65.538                     (от -32.768 до 32.767)
    int c=3;      //Имеет размер 4 байт (32 бит);  2^32 = 4.294.967.296              (от -2.147.483.648 до 2.147.483.647)
    long d=4_000L;//Имеет размер 8 байт (64 бит);  2^64 = 18.446.744.073.709.551.616 (от -9.223.372.036.854.775.808 до 9.223.372.036.854.775.807)

    //Символьные типы
    char e='e';   //Имеет размер 2 байт (16 бит);  2^16 = 65.538                     (от 0 до 65.538) кодировка Unicode

    //Типы с плавающей запятой
    float f=1.3f; //Имеет размер 4 байт (32 бит);  2^32                              (от ~1,4*10^45  до ~3,4*10^38)
    double g=1.3; //Имеет размер 8 байт (64 бит);  2^64                              (от ~4,9*10^324 до ~1,8*10^308)

    //Логические типы
    boolean h;    //Имеет размер 8 бит (в массивах), и 32 бит (не в массивах)
}
