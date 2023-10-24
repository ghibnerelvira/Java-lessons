package de.telran.summary4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tries {
    public static void main(String[] args) {
        String[] str1 = {"aaa", "abb", "abc", null, null};

        int k = 3;
        String[] withoutNulls = Arrays.copyOfRange(str1,0, k);
        System.out.println(Arrays.toString(withoutNulls));
        System.out.println(withoutNulls);
    }
}
