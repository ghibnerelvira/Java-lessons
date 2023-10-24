package de.telran.summary4;

public class PracticeFor {
    // Вывести на экран всё таблицу умножения в виде -> i * g
    // 1x1=2
    // 1x2=2
    // ..
    // 2x1=2
    // 2x2=4
    //  ..
    // 9x9=81

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.printf("%dx%d=%d%n",i,j,i*j); // formatierung
            }
            System.out.println();
        }

        // 0 1 2 3 4 5 6 7 8 9
        // 1 1 2 3 4 5 6 7 8 9
        // 2 2 4 6 8 9 10 14 16 18
        // 3...
        // ...

        for (int i = 1; i <= 9; i++){
            System.out.print(i+" | ");
            for (int j = 1; j <= 9; j++){
                System.out.printf("%2d ",i*j); // 2-> используется для пробелов между цыфр
            } System.out.println();
            if(i==1){
                System.out.println("-".repeat(30));
            }
        }
    }
}
