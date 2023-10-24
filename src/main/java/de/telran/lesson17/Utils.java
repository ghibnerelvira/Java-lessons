package de.telran.lesson17;

public class Utils {
    // Создайте метод getNumbers();
    // Метод должен возвращать массив из трех целочисленных значений: [1, 2, 3]
    // Вызовите метод в main()
    // Убедитесь, что метод работает верно

    public int[] getNumbers(){
        int[] arr = {1,2,3};
        return arr;
    }

    public int findMax(int[] arr) {
        if(arr == null || arr.length == 0)
            return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int element : arr){
            if(max < element){
                max = element;
            }
        }
        return max;
    }
}
