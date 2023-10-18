package de.telran.lesson14;

import java.util.Random;

public class Practice {

    // Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    public static void main(String[] args) {
        int [] arr1;
        arr1 = new int[15];
        Random random = new Random();
        for (int element : arr1){
            arr1[element] = random.nextInt(9);
            System.out.println(arr1[element]);
        }
        int [] arr2;
        arr2 = new int[15];
        int x = 0;
        for (int i= 0; i< arr1.length; i++){
           if (arr1 [i] %2 ==0 ) x++;
        }
        System.out.println(x);
    }
}
