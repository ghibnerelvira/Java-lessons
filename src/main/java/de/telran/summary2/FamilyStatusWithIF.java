package de.telran.summary2;

import java.util.Scanner;

public class FamilyStatusWithIF {

    // Пользователь вводит, сколько в его семье детей.
    // Программа должна определить статус семьи: бездетная, обычная (1 или 2 ребёнка)
    // или многодетная (3 и более детей).
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество детей в семье: ");
        int numberOfChildren = scanner.nextInt();

        String familyStatus = getFamilyStatus(numberOfChildren);
        System.out.println("Статус семьи: " + familyStatus);

        scanner.close();
    }

    private static String getFamilyStatus(int numberOfChildren) {
        if (numberOfChildren == 0) {
            return "Бездетная семья";
        } else if (numberOfChildren == 1 || numberOfChildren == 2) {
            return "Обычная семья";
        } else if (numberOfChildren >= 3){
            return "Многодетная семья";
        } else{
            return "Переданно значение неправельно";
        }

    }
}
