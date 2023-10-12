package de.telran.lesson11;

import java.util.Scanner;

public class PracticeBoxPrinter {

    // Напишите программу, которая будет печатать коробку из ###, принимая от пользователя значения высоты.
    //Например:
    //Вход = 3
    //Выход =
    //###
    //###
    //###
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту коробки: ");
        int height = scanner.nextInt();

        int i = 1;
        while (i > 0 && i <= height){
            System.out.println("###" +i);
           i++;
        }

    }
}
