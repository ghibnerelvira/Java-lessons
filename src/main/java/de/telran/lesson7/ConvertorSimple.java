package de.telran.lesson7;

import java.util.Scanner;

public class ConvertorSimple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("В какой системи счисления Ваше число: ");

        int numberSystem = scanner.nextInt();
        System.out.print("Введите число: ");

        String numberString = scanner.next();
        System.out.print("В какую систему счисления преобразовать: ");

        int numberSystemOut = scanner.nextInt();

        long number = Long.parseLong(numberString, numberSystem);

        String numberOutStr = Long.toString(number, numberSystemOut);
        System.out.println("Наше число в "+ numberSystemOut+" систем счисления равно = "+numberOutStr);

    }
}
