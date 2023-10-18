package de.telran.lesson13;

import de.telran.lesson13.dokumentation.PracticeAutoClassObject;

public class SimplePracticeClassObject {
    public static void main(String[] args) {
        PracticeAutoClassObject auto1 = new PracticeAutoClassObject();  // конструктор по default (умолчанию)
        auto1.consumptionFuel =10;
        auto1.volumeTank = 10;
        auto1.capacity = 3000;
        auto1.weight = 1500;
        auto1.move();
        System.out.println("Сколько груза 1 - "+auto1.getCountCargo());
        System.out.println("Сколько пассажиров 1 - "+auto1.getMaxCountPassenger());

        // 2. Вариант
        PracticeAutoClassObject auto2 = new PracticeAutoClassObject(20,10,2000,4000); // constructor в классе
        auto2.move();
        System.out.println("Сколько груза 2 - "+auto2.getCountCargo());
        System.out.println("Сколько пассажиров 2 - "+auto2.getMaxCountPassenger());


        PracticeAutoClassObject auto3 = new PracticeAutoClassObject("белый", "Audi", 10, 15,5,150,1000,3000);
        auto3.move();
        System.out.println("Сколько груза 3 - "+auto3.getCountCargo());
        System.out.println("Сколько пассажиров 3 - "+auto2.getMaxCountPassenger());
        System.out.println("Я еду на "+auto3.model+" цвет "+auto3.color);


    }


}
