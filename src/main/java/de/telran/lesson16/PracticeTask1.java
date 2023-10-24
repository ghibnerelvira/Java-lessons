package de.telran.lesson16;

public class PracticeTask1 {

    // Напишите метод, который принимает две строки в аргументах, соединяет
    // их и определяет реверсивный порядок, выведите результат на консоль.
    // -> concatReversStr(String str1, String str2)

    public static void main(String[] args) {

        String str1 = "ABBA";
        String str2 = " привет с 70-x";
        System.out.println(concatReversStr(str1, str2));

    }

    private static String concatReversStr(String str1, String str2){
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        sb.reverse();
        return sb.toString();
    }
}
