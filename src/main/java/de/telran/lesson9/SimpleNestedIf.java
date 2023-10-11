package de.telran.lesson9;

public class SimpleNestedIf {

    public static void main(String[] args) {

        // Создайте и инициализируйте переменную int = 10
        // -> В блоке if сравните созданную переменную со значением 10 (==)
        // -> Внутри блока добавьте блок if и сравните переменную со значением 15 ,
        // внутри блока добавить инструкцию System.out.println("i is smaller than 15");
        // -> Добавите еще один блок if-else и сравните переменную со значением 12
        // -> В блоке if добавить инструкцию System.out.println("i is smaller than 12 too")
        // -> В блоке else добавьте инструкцию System.out.println("i is greater than 12");
        // -> Проанализируйте вывод

        int myInt = 16;
        System.out.println("Программа начала выполняется ");

        if (myInt == 10) {  // (myInt < 20) тоже функтионирует
            System.out.println("myInt ровно 15 ");
            if (myInt< 15){
                System.out.println("myInt меньше 15");
                if (myInt < 12){
                    System.out.println("myInt меньше 12");
                }
                verifyMore(myInt); // чтобы код был меньше -> переводится в метод -> a метод -> в низ из main выходит

            }
        }

        System.out.println("Программа выполняется дальше ");

        // boolen алгебра: interval
        // -> 1.
        if (myInt < 20) if (myInt > 15){
            System.out.println("myInt в интервале от 16 до 19 ");
        }
        System.out.println("Программа выполняется ещё дальше ");

        // -> 2.
        if (myInt > 15 && myInt < 20){
            System.out.println("myInt  ТОЖЕ в интервале от 16 до 19 ");
        }
    }

    private static void verifyMore(int myInt) {
        if (myInt > 0){
            System.out.println("myInt меньше 12 и больше 0");
        }
        if (myInt > 10){
            System.out.println("myInt меньше 12 и больше 10");
        }
        else {
            System.out.println("myInt больше 12");
        }
    }


}
