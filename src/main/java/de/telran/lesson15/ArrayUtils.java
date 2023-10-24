package de.telran.lesson15;

import java.util.Arrays;

public class ArrayUtils {


// SimpleBubbleSort
        public static void sortBubble(int[] arrInt) {
            boolean isSorted;
            do{
                isSorted = false;
                for(int i = 0; i < arrInt.length-1; i++){
                    if (arrInt[i] > arrInt[i+1]){
                        int temp = arrInt[i];
                        arrInt[i] = arrInt[i+1];
                        arrInt[i+1] = temp;
                        isSorted = true;
                    }
                }
            }while (isSorted);
        }



// SimpleLinearSearch

    //    примой порядок поиска
    public static int searchLine(int[] arr, int key){
        int index = -1; // есле ненайдёт вернёт -1
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                index = i;
            }
        } return index;
    }

    // обратный порядок поиска
    public static int searchLineBackward(int[] arr, int key){
        int index = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(key == arr[i]){
                index = i;
                break;
            }
        } return index;
    }
}
