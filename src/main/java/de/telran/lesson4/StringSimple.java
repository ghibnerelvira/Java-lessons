package de.telran.lesson4;

public class StringSimple {
    public static void main(String[] args) {
        String str1 = "We go to"; // в строке считаются тоже пробелы и знаки

        String strCopy = str1; // клонирование

        System.out.println("1 "+str1);
        System.out.println("2 "+strCopy);

        str1 = str1 + " Home"; // Добавили слово в страку str1
        System.out.println("3 "+str1);
        System.out.println("4 "+strCopy);


        // метод 1
        System.out.println("Длина str1 = "+str1.length()); // .length -> считает количество символов в str.

        // метод 2
        char symbol =str1.charAt(0); // index наченается всегда с 0
        System.out.println("Первый символ str1 = "+ symbol);

        symbol = str1.charAt(str1.length()-3); // указывает на последний символ из последней строки
        System.out.println("Последний символ str1 = "+ symbol);
        // или

        // метод 3
        String subStr = str1.substring(12); // последнняя буква в строке Hom(e)<- e
        System.out.println("Пред-последняя буква в строке  = "+ subStr);

        // метод 4
        subStr = str1.substring(9, 13); // Home
        System.out.println("Только подстрока str1 -> 'Home' = "+ subStr);

        // метод 5
        System.out.println("буквы -> верхний регистр, только 'Home' = "+subStr.toUpperCase()); // делается всё большими все буквы ->верхний регистр

        System.out.println("буквы -> нижний регистр = "+str1.toLowerCase()); // делается 1.слово большими все буквы->нижний регистр

        // метод 6
        System.out.println("Замена букв 'o' на 'p' = "+str1.replace('o','p'));

        // метод 7

        boolean containsJava = str1.contains("to ");
        System.out.println("Содержит подстроку 'to'= " + containsJava);

    }
}
