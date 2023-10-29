package de.telran.summary3;

import java.util.Scanner;

public class CoolnessChecker {

    // Круто быть пьяным, молодым и злым.
    // Проверьте, что пользователь крут.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы пьяный? yes/no ");
        boolean isDrank = (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Вы молодой? yes/no ");
        boolean isYoung = (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Вы злой? yes/no ");
        boolean isAngry = (scanner.nextLine().equalsIgnoreCase("yes"));

        if(isCool(isDrank,isYoung,isAngry)){
            System.out.println("Крут!!");
        }else{
            System.out.println("Не Крут!!");
        }

    }

    private static boolean isCool(boolean isDrank, boolean isYoung, boolean isAngry ){
        return isDrank && isYoung && isAngry;
    }
}
