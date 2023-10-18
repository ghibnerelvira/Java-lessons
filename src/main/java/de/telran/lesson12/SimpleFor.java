package de.telran.lesson12;

public class SimpleFor {

    // Реализуйте метод, принимающий в параметре число.
    // Распечатайте все входящие значения числа
    // Например:
    // Вход = 8
    // Выход =
    // 1
    // 2
    // 3
    // …
    // 8
    // {}

    public static void main(String[] args) {

        int myInt = 8;

        // while
        printIntervalWhile(myInt);

        System.out.println(); // пробел
        System.out.println("2. Вариант с циклом for");

        // for -> (компактный чем while)
        printIntervalFor(myInt);


        System.out.println(); // пробел
        System.out.println("-> Вариант с вечным циклом for");

        // вечный цыкл for
        printIntervalForInfinity(myInt);
        // ещё одна рефлизация вечного цыкла -> for
        System.out.println(); // пробел
        printIntervalForInfinity2(myInt);
    }

    private static void printIntervalForInfinity2(int myInt) {
        for (int counter = 1;; counter++){
            if (counter> myInt) break;  // важно в этом случии указывать перед sout, чтобы работало коректно
            System.out.println("2. Вариант вечного цыкла = "+counter);
        }
    }

    private static void printIntervalForInfinity(int myInt) {
        int counter;
        counter = 1;
        for (;;){
            System.out.println("1. Вариант вечного цыкла = "+counter);
            counter++ ;
            if (counter> myInt) break;    // програма выйдет когда дойдёт до 8, если неуказать будет вечно
                                    // крутится пока память в Steck незакончится
        }
    }

    private static void printIntervalFor(int myInt) {
        // for -> (компактный чем while)
        System.out.println("Выход = ");
        for (int counter = 1; counter <= myInt; counter ++ ){ // for (int counter = 1) -> можно так указывать
            if(counter==5) continue; // 5-ка на экран не апичается (исключает)
            System.out.println(counter);
        }
    }

    private static void printIntervalWhile(int myInt) {
        int counter= 1;
        // while
        while(counter <= myInt) {
            System.out.println("Выход = "+counter);
            counter ++; // указывает чтобы не было вечного цыкла
        }
    }
}
