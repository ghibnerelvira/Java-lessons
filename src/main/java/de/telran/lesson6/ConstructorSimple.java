package de.telran.lesson6;

public class ConstructorSimple {
    public static void main(String[] args) {
        // 1. возможность -> ( по умолчанию -> auto как прописанно в auto)
        Auto auto1 = new Auto();
        auto1.model= "BMW";
        auto1.year= 2023;
        auto1.mileage= 200;
        auto1.run();
        auto1.turn();

        Auto auto2 = new Auto();
        auto2.model= "VW";
        auto2.year= 2022;
        auto2.mileage= 5;
        auto2.run();
        auto2.turn();

        // или -> (другой вид конструктора) -> 2. возможность

        Auto auto3 = new Auto("Audi");
        auto3.run();

        // 3. возможность
        Auto auto4 = new Auto("Porsche",2020);
        auto4.run();

        // 4. возможность
        Auto auto5 = new Auto("Lada", 2023, 5);
        auto5.run();

    }

}

