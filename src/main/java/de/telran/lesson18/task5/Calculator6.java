package de.telran.lesson18.task5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculator6 {

    // 1) Доработайте программу "Калькулятор" (версии 2) таким образом, чтобы она позволяла:
    // -> Вводить знак математической операции перед вводом каждого следующего аргумента.
    // Например, пользователь указывает, что хочет выполнить операцию над тремя аргументами.
    // -> Программа просит последовательно ввести первый аргумент, знак математической операции,
    // который будет выполнен над значениями первого и второго аргумента, значение второго аргумента,
    // знак математической операции, который будет выполнен над результатом операции
    // между первым и вторым аргументом и третьим аргументом.
    // -> В результате, программа должна позволять вычислить следующее выражение: 3 * 4 - 10.5 + 2 = 3.5

    // 2) Выводить на экран историю последних 5 вычислений.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); //  для вывода точки в качестве разделителя  4,20 -> 4.20 заменяет (,) на (.)

        String answer;
        // ° история вычисления последних 5 вычислений.
        String[] resultsHistory = new String[5];
        do {
            System.out.print("Введите количество аргументов (2 и более): ");
            int argumentCount = scanner.nextInt();

            double[] arguments = new double[argumentCount]; // массив аргументов
            char[] signs = new char[argumentCount-1]; // хранение матемотических знаков -> чисел 5, знаков 4 ( 1+3+4-2+4)
                                                     // массив для арифм. операций

            for (int i=0; i<arguments.length; i++){
                System.out.print(String.format("Введите значение %d аргумента: ",i+1));
                arguments[i] = scanner.nextDouble();
                if (i < arguments.length-1) {
                    do {
                        System.out.println("Введите знак операции (+, -, /, *, %): ");
                        String signStr = scanner.next();
                        signs[i] = signStr.charAt(0);
                    } while (signs[i] != '+' && signs[i] != '-' && signs[i] != '*' && signs[i] != '/' && signs[i] != '%');
                }
            }

            double result = arguments[0]; // i=0 -> 5 i=1 -> 2 (5+2)
            for (int i=1; i<arguments.length; i++){
                switch (signs[i-1]) {
                    case '+':
                        result += arguments[i];
                        break;
                    case '-':
                        result -= arguments[i];
                        break;
                    case '*':
                        result *= arguments[i];
                        break;
                    case '/':
                        result /= arguments[i];
                        break;
                    case '%':
                        result %= arguments[i];
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i<arguments.length;  i++){
                sb.append(String.format(" %.2f ", arguments[i]));
                if(i< arguments.length-1)sb.append(signs[i]);
            }
            sb.append(" = ").append(String.format("%.2f ", result));
            System.out.println(sb);
            System.out.println(); // пробел


            // ° перемешение и добавление если это будет нужно
            for ( int i = resultsHistory.length-1; i > 0; i--){
                resultsHistory[i] = resultsHistory[i-1];
            }
            resultsHistory[0] = sb.toString();
            System.out.println("История выполненых вычислений");
            System.out.println(Arrays.toString(resultsHistory));

            do {
                System.out.println("Продолжить вычислени? (yes/no)");
                answer = String.valueOf(scanner.next());
            }while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));

        } while (answer.equalsIgnoreCase("yes"));
    }


}
