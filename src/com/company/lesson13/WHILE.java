package com.company.lesson13;

public class WHILE { //задача на НОД
    public static int NOD(int a, int b) {
        while (b!=0){
            int c=b;
            b = a%b;
            a = c;
        } return a;
    }
}
