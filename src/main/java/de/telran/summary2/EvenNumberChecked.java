package de.telran.summary2;

public class EvenNumberChecked {
    // Написать метод который проверяетб является ли чесло чётным (even)

    public static void main(String[] args) {

        // Вариант 1
        boolean a = isEven(42);
        System.out.println("a = "+a);

        boolean b = isEven(100);
        System.out.println("b = "+b);

        boolean c = isPositiv(25);
        System.out.println("Positiv? c = "+c);

        boolean d = isNegativ(-50);
        System.out.println("Negativ? d = "+d);

        boolean e = isNotEmpty("I study Java"); // проверка, ли пустая строка
        System.out.println("I study Java = "+e);

        boolean f = isMoreFive("I study Java last weeks"); // больше 5 символов
        System.out.println("I study Java last weeks = "+f);


        // Вариант 2
        int number = 42; // Замените это число на то, которое вы хотите проверить

        if (isEven1(number)) {
            System.out.println(number + " - чётное число.");
        } else {
            System.out.println(number + " - нечётное число.");
        }

    }

    // Вариант 1
    public static boolean isEven (int number){
        return number % 2 == 0;
    }

    // Вариант 2
    // Метод для проверки чётности числа
    public static boolean isEven1(int number) {
        return number % 2 == 0;
    }

    // Проверка что число позитивное
    public static boolean isPositiv(int number) {
        return number > 0;
    }
    public static boolean isNegativ(int number) {
        return number < 0;
    }

    public static boolean isNotEmpty(String line) {
       return !line.isEmpty();
    }
    public static boolean isMoreFive (String line) {
        return line.length() > 5;
    }
}


