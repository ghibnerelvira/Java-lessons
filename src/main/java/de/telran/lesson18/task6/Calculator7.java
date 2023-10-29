package de.telran.lesson18.task6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculator7 {
    // Доработайте программу "Калькулятор" (версии 2) таким образом, чтобы она
    // -> позволяла пользователю вводить вычисляемое математическое выражение в виде одной строки.
    // Например, так 10.5*5+1-7.1 и последовательно выполняла бы указанные арифметические операции над аргументами.
    // -> выполнить рефакторинг программного кода "Калькулятора" таким образом, чтобы каждый логический шаг
    // алгоритма был бы реализован в отдельном методе.
    // -> создать отдельные методы для выполнения следующих шагов:
    // 1) String inputExpression() - для ввода строки (вычисляемого математического выражения) с клавиатуры
    // 2) double[] parseArguments(String expression) - для получения из строки математического
    // выражения значений аргументов
    // 3) char[] parseSigns(String expression) - для получения из строки математического
    // выражения знаков математических операций
    // 4) double calculate(double argumentOne, char sign, double argumentTwo)
    // - для выполнения математической операции над парой аргументов
    // 5) void printResult(String expression, double result) - для вывода результата вычисления на экран
    // -> Убедитесь, что приложение работает корректно.


    private static Scanner scanner = new Scanner(System.in);
    private static String[] resultsHistory = new String[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя
        Locale.setDefault(Locale.US); //  для вывода точки в качестве разделителя  4,20 -> 4.20 заменяет (,) на (.)

        String answer;

        do {
            String expression = inputExpression(); // Ввод выражения
            System.out.println(expression);
            double[] arguments = parseArguments(expression);
            System.out.println(Arrays.toString(arguments));

            char[] signs = parseSigns(expression);
            System.out.println(Arrays.toString(signs));

            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                result = calculate(result, signs[-1], arguments[i]);
            }
            printResult(expression, result);


            addResultToHistory(expression, result);
            System.out.println("История выполненых вычислений");
            System.out.println(Arrays.toString(resultsHistory));

            do {
                System.out.println("Продолжить вычислени? (yes/no)");
                answer = String.valueOf(scanner.next());
            } while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));

        } while (answer.equalsIgnoreCase("yes"));

    }


    static String inputExpression() {
        System.out.println("Введите математическое выражение (10.5*5+1-7.1): ");
        scanner.useLocale(Locale.ENGLISH); // для ввода точки в качестве разделителя Locolisation
        String exp = scanner.nextLine();
        return exp;
    }


    static double[] parseArguments(String expression) {
        int countArgument = countArgumentNumber(expression);
        double[] arguments = new double[countArgument];

        int currentArgumentNumber = 0;
        StringBuilder argumentAsString = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (!isSign(symbol)) {
                argumentAsString.append(symbol);
            }
            if (isSign(symbol) || i == expression.length() - 1) {
                double argument = Double.parseDouble(argumentAsString.toString());
                arguments[currentArgumentNumber] = argument;
                currentArgumentNumber++;
                argumentAsString.delete(0, argumentAsString.length());
            }
        }
        return arguments;
    }


    static boolean isSign(char symbol) {
        boolean result = symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '%';
        return result;
    }


    static int countArgumentNumber(String expression) {
        int argumentCount = 1;
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (isSign(symbol)) {
                argumentCount++;
            }
        }
        return argumentCount;
    }


    static char[] parseSigns(String expression) {
        int argumentCount = countArgumentNumber(expression);
        char[] signs = new char[argumentCount - 1];

        int countSignNumber = 0;
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (isSign(symbol)) {
                signs[countSignNumber] = symbol;
                countSignNumber++;
            }

        }
        return signs;
    }


    static double calculate(double argumentOne, char sign, double argumentTwo) {
        double result = 0.0;
        switch (sign) {
            case '+':
                result = argumentOne + argumentTwo;
                break;
            case '-':
                result = argumentOne - argumentTwo;
                break;
            case '*':
                result = argumentOne * argumentTwo;
                ;
                break;
            case '/':
                result = argumentOne / argumentTwo;
                break;
            case '%':
                result = argumentOne % argumentTwo;
                ;
        }
        return result;
    }


    static void printResult(String expression, double result){
        System.out.println(String.format("%s=%.2f", expression));
        System.out.println();

    }

    static void addResultToHistory(String expression, double result) {
        for (int i = resultsHistory.length - 1; i > 0; i--) {
            resultsHistory[i] = resultsHistory[i - 1];
        }
        resultsHistory[0] = String.format("%s=%.2f", expression);
    }

}


