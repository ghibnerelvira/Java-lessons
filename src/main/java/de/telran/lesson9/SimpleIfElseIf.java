package de.telran.lesson9;

public class SimpleIfElseIf {
    public static void main(String[] args) {

        // if else if -> выполняется только одно

        // Создайте и инициализируйте переменную int = 20
        // -> В блоке if сравните созданную переменную со значением 10 (==)
        // -> В блоке if добавить инструкцию System.out.println("i is 10")
        // -> Добавьте блок else if и сравните переменную со значением 15 (==) ,
        // внутри блока добавить инструкцию System.out.println("i is 15");
        // -> Добавите еще один блок else if и сравните переменную со значением 20 (==)
        // -> Добавьте блок else добавьте инструкцию System.out.println("i is not present");
        // -> Проанализируйте вывод

        int myInt = 15;
        System.out.println("Программа начала выполняется ");

        if (myInt == 10) {  // если одинаковое с первым программа работает дальше
                            // -> если выдает false программа ищет альтернативу и идёт дальше по else проверять
                            // myInt = 20 ->  else if (20)
                            // myInt 18 -> else ("myInt присвоено другое значение ")
            System.out.println("myInt равно 10 ");
        }
        else if  (myInt == 15){
            System.out.println("myInt равно 15 ");
        }
        else if  (myInt == 20){
            System.out.println("myInt равно 20 ");
        }
        else {
            System.out.println("myInt присвоено другое значение ");
        }

        System.out.println("Программа выполняется дальше ");


        // также можно использовать interval
        if (myInt >= 0 && myInt < 10) {
            System.out.println("myInt в интервале от 0 до 10 ");
        }
        else if  (myInt >= 10 && myInt < 15){
            System.out.println("myInt в интервале от 10 до 15");
        }
        else if  (myInt >= 15 && myInt < 20){
            System.out.println("myInt в интервале от 15 до 20 ");
        }
        else {
            System.out.println("myInt присвоено другое значение ");
        }
        System.out.println("Программа ЕЩЁ выполняется дальше ");
    }
}
