package de.telran.summary4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StringBuilderExample {

    // 1 Создайте методы для проверки логина и пароля. Логин - это email.
    // Пароль должен содержать не менее 8 символов, при этом минимумм одну
    // строчную и одну заглавную букву, цифру и один из спецсиволов (!, #, %, $).
    // 2 Создайте метод для генерации пароля по тем же правилам.
    // 3 Напишите тесты для проверки работы методов с помощью JUnit

    private static final Random RANDOM = ThreadLocalRandom.current();

    public static void main(String[] args) {

    }

    private static boolean isLoginCorrect(String login){
        if (login == null || login.isBlank() || login.length() < 5) return false;
        char at = '@';
        char point = '.';
        if (isSymbolNotCorrect(login, at)) return false;
        if (isSymbolNotCorrect(login, point)) return false;
        if (login.substring(0,login.indexOf(at)).isEmpty()) return false;
        if (login.substring(login.indexOf(at)+1, login.indexOf(point)).isEmpty()) return false;
        if (login.substring(login.indexOf(point)+1).isEmpty())return false;
        return true;

    }

    private static boolean isPasswordCorrect(String password){
        if (password == null || password.isBlank() || password.length() < 8 ) return false;
        if (!isContainsUppercase(password) || !isContainsLowercase(password)) return false;
        if (!isContainsDigit(password) || !isContainsSpecSymbol(password)) return false;
        return true;
    }

    private static boolean isContainsUppercase(String password){
        for (char s : password.toCharArray()) {
            if (Character.isUpperCase(s)) return true;
        }
        return false;
    }

    private static boolean isContainsLowercase(String password){
        for (char s : password.toCharArray()) {
            if (Character.isLowerCase(s)) return true;
        }
        return false;
    }
    private static boolean isContainsSymbol(String password, char[] mustHaveOne){
        for (char s: mustHaveOne) {
            if (password.contains(s+"")) return true;

        }
        return false;
    }

    private static boolean isContainsDigit(String password){
        return isContainsSymbol(password, new char[] {'0','1','2','3','4','5','6','7','8','9'} );
    }

    private static boolean isContainsSpecSymbol(String password){
        return isContainsSymbol(password, new char[] {'!','#', '%', '$'} );
    }

    private static boolean isSymbolNotCorrect(String login, char searched)
    {
        return login.indexOf(searched) <= 0 || login.lastIndexOf(searched) != login.length() - 1
                || login.indexOf(searched) != login.lastIndexOf(searched);
    }

    private static String generatePassword(){
        int passLength = RANDOM.nextInt(8,15);
        StringBuilder sb = new StringBuilder(passLength);
        while (!isPasswordCorrect(sb.toString()) && sb.length() < passLength){
         sb.append(generateSymbol());
        }
        return sb.toString();
    }

    private static char generateSymbol (){
        char lower = (char) RANDOM.nextInt('a', 'z'+1);
        char higher = (char) RANDOM.nextInt('A', 'Z'+1);
        char digit = (char) RANDOM.nextInt('0', '9'+1);
        char[] spec = new char[] {'!','#', '%', '$'};
        char specSymbol = spec[RANDOM.nextInt(spec.length)];
        char[] results = {lower, higher, digit, specSymbol};
        return results[RANDOM.nextInt(results.length)];



    }
}
