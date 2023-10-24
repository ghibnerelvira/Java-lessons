package de.telran.summary4;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    // Дан массив строк. Создайте метод для удаления
    // дубликатов из массива строк.
    // массив "Array"
    public static void main(String[] args) {
        String[] str = {"apple","banana", "apple", "orange", "banana"};

        String[] unique = getRemoveDuplicatesFromArray(str);
        System.out.println("1. "+ Arrays.toString(unique));
    }

    private static String[] getRemoveDuplicatesFromArray(String[] strArray){
        String[] noDuplicates = new String[strArray.length];

        int i = 0;
        for (String s : strArray) {
            if (isContain(noDuplicates,s))
                continue;
            noDuplicates[i] = s;
            i++;
        }
        return Arrays.copyOfRange(noDuplicates,0, i);
    }

    private static boolean isContain (String[] strArray, String findMe ){
        for (String s : strArray) {
            if (s == findMe) return true;
        }
        return false;
    }
}

