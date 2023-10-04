package de.telran.lesson5;

import java.util.Scanner;

public class MethodSimple {
    public static void main(String[] args) {

        int a = 15, b = 10;
        int sum = a + b;
        System.out.println("sum = "+sum);

        // или

        a = 25;
        b = 19;
        sum = a + b;
        System.out.println("sum = "+sum);

        printSum(a, b);
        printSum(13,18); // вызывать метод printSum

        sum = 12 + 25 + 16;
        System.out.println("sum1 = "+sum);

        printSum(12, 25);
        printSum(37, 16); // в уме пасчитать 12+25  и добавить 3 число

        sum = getSum(a, b) + 16;
        System.out.println("sum2.0 = "+sum);
        //или
        sum = getSum(getSum(a,b), 16);  // getSum(44,16)
        System.out.println("sum2.1 = "+sum);

        int myInt = inputInt(); // просьба пользователя ввести число
        System.out.println(myInt);

        sum = getSum(a, b, 16);
        System.out.println("sum3.0 (getSum(a, b, 16)) = "+sum); // 3.Метод
    }

    // 1.метод
    static void printSum(int arg1, int arg2){   // пользовальский метод- выполняет действие и програма пошла дальше
      int sum = arg1 + arg2;
        System.out.println(arg1+" + "+arg2+" = "+sum);

    }

    // 2.метод
    static int getSum(int arg1, int arg2){ // get посчитать сумму -  выполняет действие и возврашает результат
     int sum = arg1 + arg2;
     return sum; // return arg1+arg2; ->println писать ненужно так как проесходит возврашение return в main -> строка 29-30
    }

    // 3. метод -> который работает 2 или 3 аргументами
    static int getSum (int arg1, int arg2, int arg3){
        return arg1 + arg2 + arg3;
    }

    // 4.метод
    static int inputInt(){
        System.out.println("Введите  целое число ");
        Scanner scanner = new Scanner(System.in);
        int intVal = scanner.nextInt();
        return intVal;
    }
}
