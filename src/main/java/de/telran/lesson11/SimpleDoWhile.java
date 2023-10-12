package de.telran.lesson11;

import java.util.Scanner;

// int a; -> вы обьявили переменную.
// int a = 10; -> обьявили и сразу ее инициализировали значением
public class SimpleDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = getChoiceDoWhile(scanner); // do-while
        /*choice = getChoiceWhile(scanner); // while */
        System.out.println("Вы выбрали пункт меню: "+choice);

        if (choice >= 1 && choice<=4){
            System.out.println("Вы входити в игру... ");
        }else {
            System.out.println("Выходим из игры ");
        }

    }

    private static int getChoiceDoWhile(Scanner scanner) {
        int choice;
        do {
            System.out.println("За кого вы будете играть: ");
            System.out.println("1. Орк ");
            System.out.println("2. Человек ");
            System.out.println("3. Эльф ");
            System.out.println("4. Гном ");
            System.out.println("0. Выход ");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            if (choice == 0){
                System.out.println("Выходим из игры... ");
                break;
            }else if (!(choice >= 0 && choice<=4)){
                System.out.println("Некоректный ввод! ");
                System.out.println("Выберете заново от 0 - 4 :) ");
            }
        }while (!(choice >= 0 && choice<=4)); // или 2. вариант: (choice<0 ||choice>4)
        return choice;
    }

   /* private static int getChoiceWhile(Scanner scanner) {
        int choice;
        System.out.println("За кого вы будете играть: ");
        System.out.println("1. Орк ");
        System.out.println("2. Человек ");
        System.out.println("3. Эльф ");
        System.out.println("4. Гном ");
        System.out.println("0. Выход ");
        System.out.print("Ваш выбор: ");
        choice = scanner.nextInt();

        while (!(choice >= 0 && choice <= 4)) {
            System.out.println("За кого вы будете играть: ");
            System.out.println("1. Орк ");
            System.out.println("2. Человек ");
            System.out.println("3. Эльф ");
            System.out.println("4. Гном ");
            System.out.println("0. Выход ");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
        }
        return choice;
    }*/
}
