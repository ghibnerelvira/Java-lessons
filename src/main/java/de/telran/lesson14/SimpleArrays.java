package de.telran.lesson14;

import java.util.Arrays;

public class SimpleArrays {
    // index 0->1 , 1->2, 2->3, 3->4 ..
    public static void main(String[] args) {
        int [] arr = {1, 3, 7, 2, 4, 9, 34};
        System.out.println("1.все элементы: "+Arrays.toString(arr));

        // copyOf
        // уберает лишнее
        int[] arrCopyOf = Arrays.copyOf(arr,5);
        System.out.println("2.copyOf: "+Arrays.toString(arrCopyOf));
        // добовляет
        arrCopyOf = Arrays.copyOf(arr,10); // добавляет 3 новых ичеек по default 0
        System.out.println("3.copyOf:  "+Arrays.toString(arrCopyOf));

        // CopyOfRange -> копироет деопазон(intervall)
        int[] arrCopyofRange = Arrays.copyOfRange(arr,3,7); // с - до копирует /добавить можно тоже есле место 7 отнести 10
        System.out.println("4.copyOfRange:  "+Arrays.toString(arrCopyofRange));

        // sort сортирует массив в порядке возрастания
        Arrays.sort(arr);
        System.out.println("5.сортирует массив (sort): "+Arrays.toString(arr));
    }
}
