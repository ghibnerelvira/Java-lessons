package de.telran.lesson11;

public class SimpleWhile {
    public static void main(String[] args) {

        // -> Инициализируйте переменную int count = 10;
        // -> Создать метод, который печатает в консоле “Привет программист” count раз
        // -> Используйте цикл while

        // 1. цикл
        int count = 10;
        while (count > 0){ // (count <= 10)-> вечный цыкл,будет выполнятся пока паметь в стэки незакончится
            System.out.println("Привет программист "+count);
            count--; // дикримент пофикснны
        } // return ненужен, это тело цыкл оно заканчивается когда условие становится false

        System.out.println("Программа работает дальше ");



        // 2. вечный цыкл нерекамедуеммый, но можно тоже использовать
        int count1 = 0;
        while(true){ //-> вечный цыкл
            System.out.println("Вечный привет программист 1! "+(++count1));
            if (count1 >= 5){
                break;
            }
        }
        // Ещё одна реализация вечново цыкла
        int count2 = 3;
        count = 1;
        while(true){
            System.out.println("Вечный привет программист 2! "+count);
            count++;
            if (count >3){
                break;
            }
        }
    }
}
