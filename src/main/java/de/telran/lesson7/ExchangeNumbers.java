package de.telran.lesson7;

public class ExchangeNumbers {
    public static void main(String[] args) {
        //  Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся
        //  в двух переменных с помощью третьей переменной:
        // -> На вход: а = 2; b = 5;
        // -> На выход: a = 5; b = 2;
        // -> Используйте переменную temp;

        int a = 2, b = 5;
        System.out.println(" a = "+a+" ,b = "+b);

        int temp = b; // temp = b(5)
        b = a; // b = a(2)
        a = temp; // a = temp(5) = b(5)
        System.out.println(" a = "+a+" ,b = "+b);

        // арифметически -> работает только с double и int
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(" a = "+a+" ,b = "+b);
    }
}
