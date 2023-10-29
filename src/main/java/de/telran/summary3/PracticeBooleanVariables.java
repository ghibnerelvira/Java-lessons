package de.telran.summary3;

import java.util.Random;
import java.util.Scanner;

public class PracticeBooleanVariables {

    // Игра "Угадай число": Разработайте текстовую игру,
    // в которой компьютер выбирает случайное число, а
    // игрок должен угадать его, получая подсказки
    // "больше" или "меньше" до тех пор, пока не угадает.
    // бинарнный поиск
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(21);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите число: ");
            int user = scanner.nextInt();
            if(user == num){
                System.out.println("Вы выграли . отгадали ");
                break;
            }
            System.out.println("Чесло должно быть " + (user < num ? "больше" : "меньше"));
        } while (true);

    }
}
