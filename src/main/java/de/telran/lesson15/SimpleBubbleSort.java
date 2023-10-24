package de.telran.lesson15;

import java.util.Arrays;

public class SimpleBubbleSort {
    public static void main(String[] args) { // Сортировка

        int[] arrInt = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println("1.Начало  "+Arrays.toString(arrInt));

        // другой вариант -> Arrays.sort(arrInt);
        // переносы методов -> ArrayUtils
        ArrayUtils.sortBubble(arrInt);


        // перенесли в отдельный метод. Для того если вызывать в этом классе
        //sortBubble(arrInt);

        System.out.println("2.Конец "+Arrays.toString(arrInt));

    }

//    public static void sortBubble(int[] arrInt) {
//        boolean isSorted;
//        do{
//            isSorted = false;
//            for(int i = 0; i < arrInt.length-1; i++){ // for проверяет каждую интерацию
//                if (arrInt[i] > arrInt[i+1]){
//                    int temp = arrInt[i];
//                    arrInt[i] = arrInt[i+1];
//                    arrInt[i+1] = temp;
//                    isSorted = true;
//                }
//            }System.out.println("Шаги "+Arrays.toString(arrInt));
//
//        }while (isSorted);
//    }
}
