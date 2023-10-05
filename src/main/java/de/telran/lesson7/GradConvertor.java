package de.telran.lesson7;

import java.util.Scanner;

public class GradConvertor {
    public static void main(String[] args) {
        // Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины и Фаренгейты:
        // -> У класса должны быть методы для конвертации.
        // -> Реализуйте два метода в классе: runKelvinConverter(double baseValue) +  runFahrenheitConverter(double baseValue)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусох Цельсия: ");
        int tempGrad = scanner.nextInt();

        System.out.println("Температура в Кельвинах 1.0 : "+runKelvinConverter(tempGrad));
        System.out.println("Температура в Фарингейтах: "+runFahrenheitConverter(tempGrad));
        // другой вариант
        System.out.println(String.format("Температура в Кельвинах 2.0 : %.2f ",runKelvinConverter(tempGrad))); // %.2f пробел
        // или
        System.out.printf("Температура в Кельвинах 3.0 : %.2f \n",runKelvinConverter(tempGrad));
        System.out.printf("Температура в Кельвинах 4.0 : %.2f, Температура в Фарингете %.2f \n " ,runKelvinConverter(tempGrad),runFahrenheitConverter(tempGrad));
    }

    static double runKelvinConverter(double baseValue){
        return baseValue + 273.15;
    }

    static double runFahrenheitConverter(double baseValue){
        return 1.8 * baseValue + 32;
    }
}
