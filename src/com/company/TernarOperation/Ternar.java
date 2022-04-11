package com.company.TernarOperation;

public class Ternar {

    //  (первый операнд - условие) ? (второй операнд) : (третий операнд)
    //            (верно)          ?   (выполняется)  :   (игнорится)
    //           (неверно)         ?    (игнорится)   :  (выполняется)

    public void ternarOperation() {
        int a=2,b=3;
        int z= Short.parseShort("10000");
        int c = (a>b) ? a+b : a-b;
        System.out.println(c);
        System.out.println(z);
    }
}
