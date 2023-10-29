package de.telran.summary3;

public class MinMaxAverage {

    // Дан массив чисел. Напишите метод,
    // который в данном массиве находит
    // наименьший элемент и наибольший элемент
    // и возвращает их среднее арифметическое.
    public static void main(String[] args) {
        int[] myInt =  {5, 6, 8, 12, 789, -45};
        System.out.println("Cреднее арифметическое max, min : "+getMinMaxAverage(myInt));
    }

    private static int getMinMaxAverage(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min); // одинаково -> min = (arr[i] < min) ? arr[i] : min;
            max = Math.max(arr[i], max);
        }
        return (max+min) / 2;
    }
}
