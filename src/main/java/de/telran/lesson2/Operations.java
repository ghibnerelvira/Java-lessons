package de.telran.lesson2;

public class Operations {
    public static void main(String[] args) {
        int arg1 = 25, arg2 = 4;

        int sum = arg1 + arg2;
        int dif = arg1 - arg2;
        int mult = arg1 * arg2;
        int div = arg1 / arg2;
        int ost = arg1 % arg2;

        System.out.println("arg1 + arg2 =" +sum);
        System.out.println("arg1 - arg2 =" +dif);
        System.out.println("arg1 * arg2 =" +mult);
        System.out.println("arg1 / arg2 =" +div);
        System.out.println("arg1 % arg2 =" +ost);

        float argF1 = 25, agrF2 = 4;
        float divF = argF1 / agrF2;
        float ostF= argF1 % agrF2;
        System.out.println("argF1 / argF2 =" +divF);
        System.out.println("argF1 % argF2 =" +ostF);

        String str1 = "Kaffe", str2 = "Milch";
        String sumstr = str1 + str2;
        System.out.println("str1 +  str2 = "+sumstr);

    }
}