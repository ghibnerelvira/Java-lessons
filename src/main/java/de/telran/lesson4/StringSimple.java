package de.telran.lesson4;

public class StringSimple {
    public static void main(String[] args) {
        String str1 = "We go to";

        String strCopy = str1; // клонирование

        System.out.println("1 "+str1);
        System.out.println("2 "+strCopy);

        str1 = str1 + " Home ";
        System.out.println("3 "+str1);
        System.out.println("4 "+strCopy);


        // метод 1

        System.out.println("Длина str1 = "+str1.length()); // .length -> считает количество символов в str.

        // метод 2
        char symbol =str1.charAt(0); // index наченается всегда с 0
        System.out.println("Первый символ str1 = "+ symbol);
        symbol = str1.charAt(str1.length()-1); // указывает на последний символ из последней строки
        System.out.println("Последний символ str1 = "+ symbol);

        // метод 3
        String subStr = str1.substring(5);
        System.out.println("Подстрока str1 = "+ subStr);

        // метод 4
        subStr = str1.substring(2, 12); // Home
        System.out.println("Подстрока str1 = "+ subStr);

        // метод 5
        System.out.println(subStr.toUpperCase()); // делается всё большими все буквы

        System.out.println(str1.toLowerCase()); // делается 1.слово большими все буквы

        // метод 6
        String strTemp = strCopy.replace('E', 'H');
        System.out.println(strCopy.replace('e','h'));

        // метод 7
        System.out.println("str1 содержит ли подстроку to"+ str1.contains("to= "));

    }
}
