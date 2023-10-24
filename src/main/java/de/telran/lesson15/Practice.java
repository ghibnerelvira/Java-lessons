package de.telran.lesson15;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        // 1.
        int[] arrInt = {23, 8, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println("1.Начало  "+ Arrays.toString(arrInt));
        int keySearch = 8;

        sortBubble(arrInt);
        System.out.println(Arrays.toString(searchLine(arrInt, keySearch)));

    }
    public static void sortBubble(int[] arrInt) {
        boolean isSorted;
        do{
            isSorted = false;
            for(int i = 0; i < arrInt.length-1; i++){
                if (arrInt[i] < arrInt[i+1]){
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[i+1];
                    arrInt[i+1] = temp;
                    isSorted = true;
                }
            }
        }while (isSorted);
        System.out.println("2.Конец "+Arrays.toString(arrInt));
    }

    // 2.
    static int[] searchLine(int[] arrInt, int keySearch){
        int[] indexLine = new int[2];
        int index = 0;
        for (int i=0; i<arrInt.length; i++){
            if (keySearch == arrInt[i]){
                indexLine[index] = i;
                index++;
            }
        }
        return indexLine;
    }

}
