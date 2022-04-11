package com.company.lesson30;

import java.text.NumberFormat;

public class PerimeterSquare {
    public void getPerimeter(String str) throws PerimeterException {

        Square square = new Square();

        try {
            double side = Double.parseDouble(str); //Здесь осуществляется ПАРСИНГ - смена типа константы.
            square.setSide(0);
        } catch (NumberFormatException e) { //Ошибка возникнет если стороной квадрата окажется НЕ число
            throw new PerimeterException("String is incorrect",e); //Передача сообщения (String message) и причины (Throwable cause)
        } catch (PerimeterException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
