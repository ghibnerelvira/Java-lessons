package de.telran.lesson2;

public class TypesDate {
    public static void main(String[] args) {
        int myInt;
        myInt = 25;
        System.out.println(myInt);
        int myIntOther = 10;

        myInt = 13;
        System.out.println(myInt);

        // Целочисленные типы

        byte myByte = 18; //-128...127
        short myShort = 200; //-32768...32767
        int myInt1 = 40_000; // -3 млрд. ... 3 млрд.
        long myLong = 100_000; // очень большое число

        // Дробные числа

        float myFloat = 3.14F; //
        double myDouble = 1000.85; //

        // Элемент для хранение символов

        char myChar = 'd'; // для хранения символов
        String myStr = "Hello world"; // для хранения строки

        // Для хранения истины или ложы

        boolean myBool = true; // false - логический тип

        System.out.println("Моя переменная myByte = " +myByte);
        System.out.println("myShort = " +myShort);
        System.out.println("myInt1 = " +myInt1);
        System.out.println("myLong = " +myLong);
        System.out.println("myFloat = " +myFloat);
        System.out.println("myDouble = " +myDouble);
        System.out.println("myChar = " +myChar);
        System.out.println("myStr = " +myStr);
        System.out.println("myBool = " +myBool);
    }
}
