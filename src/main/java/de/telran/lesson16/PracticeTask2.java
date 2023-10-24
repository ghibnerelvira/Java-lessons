package de.telran.lesson16;

public class PracticeTask2 {

    // Дан массив символов, объедините его и замените символ '?' на правильный
    // символ, выведите результат на консоль.
    // -> char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};    -> I lik? Java
    // Console: I like Java
    public static void main(String[] args) {

        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String str = new String(arr);
        str = str.replace("?", "e");
        System.out.println(str);

    }


}
