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
        // System.out.println("arg1 / arg2 =" +(arg1 / 0)); -> делить на ноль в int нельзя!!

        float argF1 = 25, agrF2 = 4;
        float divF = argF1 / agrF2;
        float ostF= argF1 % agrF2;
        System.out.println("argF1 / argF2 =" +divF);
        System.out.println("argF1 % argF2 =" +ostF);
        System.out.println("argF1 / argF2 =" +(argF1 /0)); // можно делить но покажет бесконечно

        String str1 = "Kaffe", str2 = " Milch";
        String sumstr = str1 + str2;
        System.out.println("str1 +  str2 = "+sumstr);

        char c1 = 'k', c2 = 'm';
        int sumChar = c1 + c2;
        System.out.println(sumChar);
        System.out.println(Character.getNumericValue(c1)+ "+" + Character.getNumericValue(c2));
        // решение и за таблицы unicode (сложил k=5 + m=78 =216)
        // char исползуется только для анализа -> Быть осторожным при арифметических оперфций с char



    }
}
