package com.company.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ABC {
    public void show() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(""); // Проверяемое исключение - подсвечивается
        // В данном конкретном случае у нас есть 2 варианта обработки исключения (предлагаются компилятором):
        // 1) try/catch
        // 2) Добавив в сигнатуру метода сигнатуру TROWS - используется с целью повременить с обработкой исключения. ...
        // 2) ... Для чего это нужно: а) Не нужно писать логер; б) Для вывода сообщений об исключении, тем кому их...
        // 2) б)... нужно видеть; Пример: пользователь - "Неправильно введено имя", сервер - "Ошибка в работе метода show()"
    }
}
