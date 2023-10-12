package de.telran.lesson10;

public class SimpleCase {
    public static void main(String[] args) {

        //1.
        // if else if -> похоже на реализацию case -> может выполнится только одно
        // анализирует все услевия
        int myInt = 15;
        System.out.println("Программа начала выполняется ");

        if (myInt == 10) {
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

        //2. switch case
        switch (myInt){
            case 10:
            System.out.println("myInt равно 10 ");
                break;
            case 15:
                System.out.println("myInt равно 15 ");
                break;
            case 20:
                System.out.println("myInt равно 20 ");
                break;
            default:
                System.out.println("myInt присвоено другое значение ");
                // break ненужен так-как это последние элемент.
                // -> в default можно тоже ставить break если это непоследний элимент.
                // break нужен для того чтобы был выбор (непичаталось всё)
        }
        //  switch case со стракой
        String myStr = "Понедельник ";
        int numberDayOfWeek;  // = 0; заменна ->numberDayOfWeek = Integer.MAX_VALUE;  чтобы неписать  // начинается всегда с 0
        int temperature = 16;
        switch (myStr){
            case "Понедельник ":
                numberDayOfWeek = 1;
                switch (temperature){  // можно тоже добовьлять
                    case -20:
                        System.out.println("Ребёнок в школу не идёт ");
                        break;
                    case 0:
                        System.out.println("Осторожно может быть галолёд ");
                        break;
                    case 16:
                        System.out.println("Ребёнок идёт школу  ");
                        break;
                    default:
                        System.out.println("Не зависим от температуры  ");
                }
                break;
            case "Вторник ":
                numberDayOfWeek = 2;
                break;
            case "Среда ":
                numberDayOfWeek = 3;
                break;
            case "Четверг ":
                numberDayOfWeek = 4;
                break;
            case "Пятница ":
                numberDayOfWeek = 5;
                break;
            case "Субота ":
                numberDayOfWeek = 6;
                if (temperature > 15){  // можно добавлять
                    System.out.println("Мы поедим на дачу ");
                }
                break;
            case "Воскресенье ":
                numberDayOfWeek = 7;
                break;
            default:
                numberDayOfWeek = Integer.MAX_VALUE;
        }
        System.out.println(myStr+ " это "+numberDayOfWeek+" день недели ");
    }
}
