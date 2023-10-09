package de.telran.lesson8;

import java.util.Scanner;

public class IfSimple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        System.out.println("Введите число: ");


        // 1. IF -> ответвление
        if (myInt >18) {
            System.out.println("Число больше 18 ");
        }

        // прибавить к числу myInt
        int sum = myInt + 5;
        System.out.println("Сумма= "+sum);

        // или
        // int myInt = 18;
        // if (myInt >10)
        // System.out.println("Он уже совершеннолетний ");
        // int sum = myInt + myInt;

        // 2. IF -> разветление
        if(sum > 0) {
            System.out.println("Сумма положительная ");
        }
        else {   // или
            System.out.println("Сумма отрецательная ");
        }

        System.out.println("Программа работает дальше");
    }
}
