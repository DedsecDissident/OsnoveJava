package com.company.lesson28;

import com.company.lesson28.BodyParts.Body;
import com.company.lesson28.BodyParts.Head;

public class Robot <H extends Head> { //ПАРАМЕТРИЗИРОВАННЫЙ КЛАСС
    private Body body;
    private H head;

     public <T1,T2 extends Head> T2 foo(T1 a, T2 b){ //ПАРАМЕТРИЗИРОВАННЫЙ МЕТОД; функционал таких методов критически узкий

        // head.burn;    //С полями типа-параметр, в методах, ничего нельзя сделать.
        // head=head+1;  //С полями типа-параметр, в методах, ничего нельзя сделать.
         return b;
    }

    public Robot(Body body, H head) {
        this.body = body;
        this.head = head;
    }

    public H getHead() {
        return head;
    }

    public void setHead(H head) {
        this.head = head;
    }
}
