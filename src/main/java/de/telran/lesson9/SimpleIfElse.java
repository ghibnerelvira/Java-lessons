package de.telran.lesson9;

public class SimpleIfElse {
    public static void main(String[] args) {

        // Создайте и инициализируйте переменную int = 10
        // -> В блоке if сравните созданную переменную со значением 15
        // -> Внутри блока добавьте инструкцию System.out.println("i is smaller than 15");
        // -> В блоке else добавьте инструкцию System.out.println("i is greater than 15");
        // -> Проанализируйте вывод


        int myInt = 10;
        System.out.println("Программа начала выполняется ");

        if (myInt >= 15) {
            System.out.println("myInt больше или равно 15 ");
        }
        else  {
            System.out.println("myInt меньше 15 ");
        }

        System.out.println("Программа выполняется дальше ");

    }
}
