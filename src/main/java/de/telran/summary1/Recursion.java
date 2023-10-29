package de.telran.summary1;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Recursion {
    public static void main(String[] args) throws InterruptedException {
        int start = new Random().nextInt(100);
        System.out.println("Начальное число: "+start);
        count(start);
    }
    // 1.
    // Создайте метод, который ведёт натуральный счёт от случайно заданного числа.

    static void count(int start) throws InterruptedException {
        System.out.println("Start= "+start);
        count(start +1); // или -> start ++ ( +2 указывает что шаг будет делаться через 2)
        Thread.sleep(1000);
    }
    //В консоле->
    // Начальное число: 80
    //Start= 80
    //Start= 81
    //Start= 82..... потом выдаёт ошибкуб так-как перегрузка

}
