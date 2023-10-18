package de.telran.lesson12;

public class SimpleIncludeFor {
    public static void main(String[] args) {

        //  i <= n; -> высота 4 (###) -> 5 этажей
        // j <= m; -> ширина 7 (###) -> 4 окон

        int m = 7, n = 4; // 2 переменные
        for(int i = 1; i <= n; i++){  //  z.B. количество недель
            for(int j = 1; j <= m; j++){ // z.B. количество дней недели
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
