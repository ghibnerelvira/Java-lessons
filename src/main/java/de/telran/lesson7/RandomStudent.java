package de.telran.lesson7;

import java.util.Random;
import java.util.Scanner;

public class RandomStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое количество студентов присутствует: ");
        int countStudents = scanner.nextInt();

        System.out.println("Будет отвечать студент с номером: "+generateNumberStudent(countStudents));

    }


    static int generateNumberStudent(int countStudents){
        int generateNumber = generateIntRandomInterval(2, countStudents);
        return generateNumber;
        // или
        // Random random = new Random();
        // int generateNumber = random.nextInt(countStudents - 2) + 2;

    }

    static int generateIntRandomInterval(int min, int max){ // min=10, max=100
       Random random = new Random();
        int result = random.nextInt(max - min)+min;
        return result;
    }
}
