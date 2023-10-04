package de.telran.lesson3;

import java.util.Locale;
import java.util.Scanner;

public class ScannerSimple {
    public static void main(String[] args) {

        int myInt = 15;
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in); //блогодаря этому пользователь может сам вести число и оно отобразится
        scanner.useLocale(Locale.ENGLISH); // для настройки локализации( . / , )

        System.out.print("Введите число: "); // без (..ln) пишется рядом -> 12
        myInt = scanner.nextInt();
        System.out.println(myInt);

        System.out.println("Введите число2: "); // без (..ln) пишется на следуйшей строки-> 12
        myInt = scanner.nextInt();
        System.out.println(myInt);

        System.out.println("Введите boolean: "); // false, right
        boolean myBool = scanner.nextBoolean();
        System.out.println(myBool);

        System.out.println("Введите дробное число:.."); // число можно вводить с ( , / . )
        double myDouble = scanner.nextDouble();
        System.out.println(myDouble);


        //для строки
        Scanner scannerStr = new Scanner(System.in); // только для букв нужно делать новый сканнерб с цыфрами можно/но невсегда!
        System.out.println("Введите имя2:...");
        String myStr = scannerStr.nextLine();
        System.out.println(myStr);

    }

}
