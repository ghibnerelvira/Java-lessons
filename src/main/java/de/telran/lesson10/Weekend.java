package de.telran.lesson10;

public class Weekend {
    public static void main(String[] args) {

        int day = 2; // указывает поиск

        // для большово числа делается интервал через if a не switch

        // 1. вариант
        if (day >= 1 && day<= 5){
            System.out.println("if-else -> Рабочий день ");
        }
        else if(day == 6 || day == 7){
            System.out.println("if-else ->Выходной ");
        } else {
            System.out.println("if-else -> Не корректный день недели ");
        }


        // 2.вариант
        switch (day){
            case 1:
                System.out.println("switch 1 -> Рабочий день ");
                break;
            case 2:
                System.out.println("switch 1 -> Рабочий день ");
                break;
            case 3:
                System.out.println("switch 1 -> Рабочий день ");
                break;
            case 4:
                System.out.println("switch 1 -> Рабочий день ");
                break;
            case 5:
                System.out.println("switch 1 -> Рабочий день ");
                break;
            case 6:
                System.out.println("switch 1 -> Выходной ");
                break;
            case 7:
                System.out.println("switch 1 -> Выходной ");
                break;
            default:
                System.out.println("switch 1 -> Не корректный день недели ");
        }
        // короткий вариант
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("switch 2 -> Рабочий день ");
                break;
            case 6:
            case 7:
                System.out.println("switch 2 -> Выходной ");
                break;
            default:
                System.out.println("switch 2 -> Не корректный день недели ");
        }
        // короткий вариант только с jdk 14+ // File -> Projekt Strukture -> jdk, language менять
        // switch (day){
        //    case 1,2,3,4,5:
        //        System.out.println("switch -> Рабочий день ");
        //        break;
        //    case 6,7:
        //        System.out.println("switch -> Выходной ");
        //        break;
        //    default:
        //        System.out.println("switch -> Не корректный день недели ");
        //}

    }
}
