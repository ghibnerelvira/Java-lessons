package de.telran.lesson9;

public class SimpleIf {

    public static void main(String[] args) {

        // 1.
        // Создайте и инициализируйте переменную int = 10
        // В блоке if сравните созданную переменную со значением 15
        // После блока добавьте инструкцию System.out.println("I am Not in if");
        // Проанализируйте вывод

        int myInt = 10;
        System.out.println("Программа начала выполняется ");

        if (myInt >= 15) { // <=15 небольше равно , ==15 равно, !=15 не равно
            System.out.println("Я попал в If "); // если больше чем 15  будет песатся
        }
        System.out.println("Программа выполняется дальше ");

        // В английском языке операция разветвления (if else)
        // -> называется "conditional branching" или "conditional statement,"
        // а в немецком - "bedingte Verzweigung" или "if-else-Anweisung."
    }
}
