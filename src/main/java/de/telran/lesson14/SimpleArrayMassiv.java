package de.telran.lesson14;

import de.telran.lesson13.SimplePracticeClassObject;
import de.telran.lesson13.dokumentation.PracticeAutoClassObject;
import de.telran.lesson6.Auto;

import java.util.Arrays;
import java.util.Random;

public class SimpleArrayMassiv {
    // Массивы
    // к каждому index  присваевается по default всегда 0
    public static void main(String[] args) {
        // обычная переменная
        int a;
        a = 5;

        // 1. Вариант через index массивная переменная
        System.out.println("1. Вариант:");
        int [] arr;
        arr = new int [5];  // int=35 -> 35 * 5 = 160 bit  // 5 элементов -> 4 index(ечеек)
        printArray(arr);
        System.out.println("2. Вариант:");
        arr[2]= 25;
        printArray(arr);

        System.out.println("Записать [2] элемент index отдельно: "+arr[2]);

        System.out.println(); // пробел
        // 2. Вариант (массивная переменная) через for
        System.out.println("2. Вариант (массивная переменная) через for: ");
        printArrForEach(arr);


        int [] arr1 = {1, 25, 17, 3, 19, 8};
        printArray(arr1);
        System.out.println(); // пробел

        // 3. Вариант через for Random
        System.out.println("3. Вариант через for Random: ");
        Random rnd =new Random();
        int [] arr2 = new int [10];
        for (int i= 0; i<arr2.length; i++){
            arr2[i] =rnd.nextInt(10);
        }
        printArray(arr2);
        // печатаем массив в одну строку
        System.out.println("Печатаем массив в одну строку (Random): "+Arrays.toString(arr2)); // ->[8, 8, 0, 6, 1, 4, 1, 8, 7, 9]

        System.out.println(); // пробел
        // Массивы обектов
        Auto auto = new Auto("Ваз",2005,10_000); // Lesson 6
        System.out.println(auto.toString());

        Auto[] autos = new Auto[2];
        autos[0] = auto;
        autos[1] = new Auto("Audi",2022,5000);
        System.out.println(Arrays.toString(autos));

        Auto[] autosLiteral = { new Auto("BMW", 2010, 1000_000),
                                new Auto("VW", 2015, 50_000),
                                new Auto("Pego", 2011, 33_000)};
        autosLiteral[1].year =2018;
        System.out.println(Arrays.toString(autosLiteral));

        // 2.
        System.out.println(); // пробел

        String[] arrStr = {"Мама","мыла","раму"};
        arrStr[1] = "чистила"; // для последнего обекта указывать -> index 2
        System.out.println(Arrays.toString(arrStr));

    }



    // ° 2. Вариант
    private static void printArrForEach(int[] arr) {
        for (int element : arr){
            System.out.println("Вариант через for element: "+element); // (++element) -> увелечение на 1
        }
    }

    // ° 1. Вариант
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // i<arr.length-1; -> достигаем последниго элемента 4
            // i<arr.length; -> достигаем все 4
            
            // if (i % 2 == 0){ -> Указывает только парнные / Console: -> arr[0]=0
                                                                        //arr[2]=0
                                                                        //arr[4]=0
            System.out.println("arr["+ i + "]=" + arr[i]); // (++arr[i]) -> увелечение на 1 -> 2. Вариант: arr[0]=2
                                                                                        // 2. Вариант: arr[1]=2
                                                                                        // 2. Вариант: arr[2]=26
                                                      // +arr[i] -> без увелечение
        }
    }
}
