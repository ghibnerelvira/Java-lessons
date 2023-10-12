package de.telran.lesson10;

public class TernaryOperation {
        // Тернарный оператор Java — единственный условный оператор, который принимает три операнда.
        // Это однострочная замена инструкции if-then-else.
        //  Мы можем использовать тернарный оператор вместо условий if-else.
        // Условный оператор занимает меньше места и помогает писать операторы if-else кратчайшим возможным способом.
    public static void main(String[] args) {

        int myInt = 11;
        String printStr;

        // 1. вариант
        if(myInt > 10){
            printStr = "myInt 1 -> больше 10";
            if (myInt < 20){
                printStr = "myInt 1 -> больше 10 и меньше 20";
            }
        }
        else {
            printStr = "myInt 1 -> меньше либо равно 10";
        }
        System.out.println(printStr);



        // 2. вариант -> тернарный оператор ( (:)-> oder) true.. -> : ..->false
        printStr = (myInt >10) ? "myInt 2 -> больше 10":"myInt 2 -> меньше либо равно 10";

        // вложанный тернарный оператор (рaботать будет, но не читаемо) true.. -> : ..->false
        printStr = (myInt >10) ?
                ((myInt < 20) ? "myInt 2 -> больше 10 и меньше 20":"myInt 2 -> больше 10")
                :"myInt 2 -> меньше либо равно 10";
        // "big text big text" + "jdhvbdjkfgnhb"
        System.out.println(printStr);
    }
}
