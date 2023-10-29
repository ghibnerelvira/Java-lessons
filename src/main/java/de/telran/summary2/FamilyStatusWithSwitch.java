package de.telran.summary2;

import java.util.Scanner;

public class FamilyStatusWithSwitch {

    // Пользователь вводит, сколько в его семье детей.
    // Программа должна определить статус семьи: бездетная, обычная (1 или 2 ребёнка)
    // или многодетная (3 и более детей).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество детей в семье: ");
        int numberOfChildren = scanner.nextInt();

        String familyStatus;

        switch (numberOfChildren) {
            case 0:
                familyStatus = "Бездетная семья";
                break;
            case 1:
            case 2:
                familyStatus = "Бездетная семья";
                break;
            default:
                familyStatus = "Многодетная семья";
                break;
        }

        System.out.println("Статус семьи: " + familyStatus);

    }

    // JDK 17: switch
    //  public static void main(String[] args) {
    //      System.out.println(getFamilyStatus(-5));
    // }

    // private static String getFamilyStatus(int count) {
    // if (count < 0) {
    //      return " Введенно неправельное количество детей ";
    // }
    //
    // String status = switch ( count ) {
    //  case 0 -> "Бездетная семья";
    //  case 1 ,2 -> "Бездетная семья";
    //  default -> "Многодетная семья";
    // };
    // return status;
    // }
    // }

}

