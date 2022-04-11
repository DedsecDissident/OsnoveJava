package com.company.lesson17;

public class Bus {
    public String model,color;
    public Engine engine;  //Объект объявлен
    public Transmission transmission;

    public final String serialNumber1 = "BY27612AA";
    public final int serialNumber2 = 27612;

    public void go(String get){
        System.out.println("go");
        System.out.println(get);
    }

    public int showKM(int KM){
        engine = new Engine(); //объект создан
        int KM1 = KM;
        String str="70";
        return KM;
    }

    Engine.Ass ass = new Engine.Ass();
    private static class Add {

    }
}
