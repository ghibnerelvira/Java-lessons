package de.telran.lesson18.task1;

import java.util.Locale;
import java.util.Scanner;

public class Calculator1 {

    // -> Напишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью.
    // Тип данных вводимых аргументов должен быть Double.
    // -> Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки,
    // а затем программа должна преобразовать введенную строку в значение переменной типа Char
    // (получить из строки первый символ методом string.charAt(0);).
    // -> Требуется произвести проверку введенных данных:

    // -> Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том, что указанная
    // операция не поддерживается программой.

    // -> Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента ввёл значение 0,
    // то программа должна вывести сообщение о том, что на 0 делить нельзя.

    // -> В обеих ситуациях программа должна прекращать дальнейшую работу.

    // -> Результат вычислений необходимо вывести с точностью до двух чисел после запятой в формате
    // <значение переменной argumentOne> <знак математической операции> <значение переменной argumentTwo>
    // = <значение переменной результата>.
    // {}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); //  для вывода точки в качестве разделителя  4,20 -> 4.20 заменяет (,) на (.)

        System.out.println("Разделитель между цело и дробной частью - точка! ");
        System.out.print("Введите значение первого аргумента: ");
        double argumentOne = scanner.nextDouble();

        System.out.print("Введите знак операции (+, -, /, * ): ");
        String signStr = scanner.next();
        char sign = signStr.charAt(0);
        if (sign!='+' && sign!='-' && sign!='/' && sign!='*') {
            System.out.println(sign + " Не корректная операция! ");
            return; // exit(1) -> выйти полоснтью
        }

        System.out.print("Введите значение второго аргумента: ");
        double argumentTwo = scanner.nextDouble();
        if (argumentTwo == 0.0 && sign == '/'){
            System.out.println("На 0 делить нельзя! ");
            return;
        }

        double result = 0.0; // 0.0 -> потому-что double
        if(sign == '+'){
            result = argumentOne + argumentTwo;
        }else if(sign == '-'){
            result = argumentOne - argumentTwo;
        }else if (sign == '/'){
            result = argumentOne / argumentTwo;
        }else if (sign == '*'){
            result = argumentOne * argumentTwo;
        }

        System.out.println(String.format("%.2f %s %.2f = %.2f",argumentOne, sign, argumentTwo, result));
                                                            // %f-> breked (дырка) значение переменной argumentOne
                                                            // %s-> знак математической операции
                                                            // %f-> breked (дырка) значение переменной argumentTwo
                                                            // =
                                                            // %f-> breked (дырка) значение переменной результата
        // %d -> срезает дробную часть
        // %.2f -> 4,20 уберает лишнее
        // %f -> 4,200000

    }

}
