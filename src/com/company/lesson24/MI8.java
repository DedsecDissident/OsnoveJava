package com.company.lesson24;

public class MI8 extends Helicopter implements VerticalTakeOff{

    @Override
    public void fly() {
        System.out.println("MI8 вертит лопастями в полёте");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Осуществляется вертикальный взлёт MI8");
        fly();
    }
}
