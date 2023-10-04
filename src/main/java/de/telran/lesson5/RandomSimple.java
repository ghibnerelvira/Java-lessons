package de.telran.lesson5;

import java.util.Random;
import java.util.Scanner;

public class RandomSimple {
    public static void main(String[] args) {

        // 1.тип -> уже стоит
        int myInt;
        myInt = 15;
        System.out.println("myInt = "+myInt);

        // 2.тип -> пользователь сам водит
        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println("Scanner myInt = "+myInt);

        // 3.тип
        Random random = new Random ();
        myInt = random.nextInt();
        System.out.println("Random myInt = "+myInt);
        // или
        myInt = random.nextInt(100); // указывает до кокова числа нужно сгенарировать-> 0..100
        System.out.println("Random myInt 1 = "+myInt);
        // интервал от 10 до 100
        myInt = random.nextInt(90)+10; // 10..100
        System.out.println("Random myInt 2 = "+myInt);

        // для отдельного метода (generateIntRandomInterval), чтобы не повторятся
        myInt = generateIntRandomInterval(10, 20); // или 10 до 100
        System.out.println("Random myInt 3 = "+myInt);

        // другой вариант
        myInt = (int) (Math.random()*(100)+10); // 0.433546 -> * 100 = 43
        //myInt = (int) (Math.random()*(100-10)+10); // 0.933546 -> 10... 100
        // лутчше писать -> тоже самое
        // myInt = (int) (Math.random()*(90)+10); // 0.933546  -> 10..100
        // myInt = (int) (Math.random()*(20-15)+15); // 0.433546 -> 15..20
        // Правило: myInt = (int) (Math.random()*(max-min)+min);
    }

    static int generateIntRandomInterval(int min, int max){ // min=10, max=100
       Random random = new Random();
       int result = random.nextInt(max - min)+min;
       return result;
    }

}

