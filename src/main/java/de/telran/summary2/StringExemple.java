package de.telran.summary2;

import java.util.Locale;

public class StringExemple {
    public static void main(String[] args) {
       //1.
        String  str = "негры ночью грузят уголь";
        String result = replaceBadWord(str);
        System.out.println("Строка заменяет некоретные слова = "+result);
        System.out.println(result.length() - str.length()); // считается длина строки
        //2.
        System.out.println(getAbbrivation("Федеративная", "Республика","Германия"));
        System.out.println(getAbbrivation("Федеративная", "Республика","Германия", "Евросаюза"));
    }

    // 1.
    // Напишите метод, который заменяет неполиткорректное слово "негр"
    // на нейтральное "афроамериканец" в любой строке. Выведите полученную строку в консоль.
    // -> Подсчитайте, насколько изменилась длина строки.
    static String replaceBadWord(String str){
       return str.replace("негр","афрофмериканец");
    }

    // 2.
    // Напишите метод, который принимает три строки и создаёт аббревиатуру.
    // Перегрузите метод вариантом с четырьмя строками и пятью строками.
    static String getAbbrivation(String str1, String str2, String str3){
        return ("" + str1.charAt(0)+ str2.charAt(0)+ str3.charAt(0)).toUpperCase(Locale.ROOT);
        // кавычки ("") делают возможность чтобы превратить строку в строку а не в int
    }

    static String getAbbrivation(String str1, String str2, String str3, String str4){
        // return ("" + str1.charAt(0)+ str2.charAt(0)+ str3.charAt(0) + str4.charAt(0)).toUpperCase(Locale.ROOT);
        // или
        return (getAbbrivation(str1, str2, str3) + str4.charAt(0)).toUpperCase(Locale.ROOT);
        // .toUpperCase -> делает буквы большыми
    }


}
