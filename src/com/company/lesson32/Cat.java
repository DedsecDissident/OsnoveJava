package com.company.lesson32;

// Сериализация процесс сохранения объекта в потоке для его хранения или дальнейшего использования

// ВНИМАНИЕ!!! В IntellijIdea ЭТО ИСПРАВЛЕНО!!! ДЕСЕРИАЛИЗАЦИЯ НЕВОЗМОЖНА если мы изменили класс после сериализации. ...
// ... Мы как бы пытаемся восстановить другой класс Cat, ведь их внутренности разные, даже если мы просто создадим ...
// ... пустую строку. private static final long serialVersionUID = 1L;

import java.io.Serializable;

public class Cat implements Serializable { // Интерфейс-маркер. Мы просто сказали о том, что этот класс будет ...
                                           // ... сериализован.

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
