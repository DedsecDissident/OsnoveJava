package com.company.lesson19;

public class Encapsulation {//Прямого доступа к внутренностям проги не должно существовать
    private int a=5, b=8;
    private final double pi = Math.PI; //Эту переменную нам явно нужно защитить от изменения, иначе прога ляжет.
                                       //final чисто для того, чтобы защитить даже от собственного воздействия ;)

    public int foo(){
        return a+b;
    }



    public int getA() {
        System.out.println(s);
        return a;
    }

    int s=5;

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
