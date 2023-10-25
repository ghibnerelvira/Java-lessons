package de.telran.lesson18.task2;

import java.util.Locale;
import java.util.Scanner;

public class Calculator2 {

    // Улутшение
    // Используйте оператор switch-case вместо оператора if-else при обработке
    // введенной математической операции. (работает быстрее)
    // К списку арифметических операций, выполняемых калькулятором, добавьте
    // поддержку операции деления по модулю (%), возвращающую остаток от деления.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); //  для вывода точки в качестве разделителя  4,20 -> 4.20 заменяет (,) на (.)

        System.out.println("Разделитель между цело и дробной частью - точка! ");
        System.out.print("Введите значение первого аргумента: ");
        double argumentOne = scanner.nextDouble();

        System.out.print("Введите знак операции (+, -, /, *, %): ");
        String signStr = scanner.next();
        char sign = signStr.charAt(0);

        System.out.print("Введите значение второго аргумента: ");
        double argumentTwo = scanner.nextDouble();

        double result = 0.0;

        switch (sign) {
            case '+':
                result = argumentOne + argumentTwo;
                break;
            case '-':
                result = argumentOne - argumentTwo;
                break;
            case '/':
                if (argumentTwo == 0.0) {
                    System.out.println("На 0 делить нельзя!");
                    return;
                }
                result = argumentOne / argumentTwo;
                break;
            case '*':
                result = argumentOne * argumentTwo;
                break;

            case '%':
                if (argumentTwo == 0.0) {
                    System.out.println("На 0 делить по модулю нельзя!");
                    return;
                }
                result = argumentOne % argumentTwo;
                break;
            default:
                System.out.println(sign + " Не корректная операция!");
                return;
        }

        System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result));
    }

}
