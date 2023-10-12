package de.telran.lesson10;


import java.util.Scanner;

public class Calculator {

    // У нас есть переменный int a,b.
    // strOperation - для арифметической операции (+, - , / , *).
    // -> реализовать с помощью case вычисление результата.
    // -> Например: a + b, a -c вывести на экран
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        System.out.println("Введите арифметическую операцию (+, - , / , *)");
        char strOperation = scanner.next().charAt(0);

        int result;

        switch (strOperation){
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if (b != 0){
                    result = a / b;
                } else {
                    System.out.println("Делить на ноль нельзя! ");
                    return;
                }
                break;
            default:
                System.out.println("Невернная операция ");
                return;
        }

        System.out.println("Результат = "+result);

    }
}
