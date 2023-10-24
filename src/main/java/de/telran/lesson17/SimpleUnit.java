package de.telran.lesson17;

import java.util.Arrays;

public class SimpleUnit {
    public static void main(String[] args) {

        Utils utils = new Utils();
        int[] myArr = utils.getNumbers();
        System.out.println(Arrays.toString(myArr));
    }
}
