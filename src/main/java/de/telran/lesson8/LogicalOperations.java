package de.telran.lesson8;

import java.util.Random;

public class LogicalOperations {
    public static void main(String[] args) {

        Random random = new Random();
        int myInt = random.nextInt(40);  // max. до 40 температура
        System.out.println("Температура воздха: "+myInt);


        if(myInt < 15) {
            System.out.println("На улице холодно ");
        }
        if(myInt > 30) {
            System.out.println("На улице жарко ");
        }

        if(myInt >= 15 && myInt <= 25){ // интервал -> Оператор И (AND) ( && )
            System.out.println("На улице тепло ");
        }

        if(myInt > 25 && myInt <= 30){ // интервал -> Оператор И (AND) ( && )
            System.out.println("На улице тепло ");
        }

        if(myInt < 0 || myInt > 80) {  //Оператор ИЛИ (OR) ( || )
            System.out.println("Не корректная температура в помещении!!  ");
            System.exit(0);
        }

        if(! (myInt > 30)) {  //Оператор НЕ (NOT) ( ! ) -> z.B. это как написать противопоказаний.
            // Для тех у кого есть протевопоканий пить нельзя - а у кого нету можно.
            // (если температура выше 30 то будет писатся если меньше то небудет писатся в консоле.)
            System.out.println("На улице OK ");
        }

    }
}
