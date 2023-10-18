package de.telran.lesson13.dokumentation;

/**
 *
 */  // -> dok коментарии

// class
public class PracticeAutoClassObject {
    public String color; // public нужно указывать чтобы было доступно для папки lesson 13 -> SimplePracticeClassObject
    // в одной папки, где находятся на одном уровне class можно указывать -> String color;
    // private указывает то что ненадо видеть другим обектам
    // protected доступен из любого места в текущем классе или пакете или в производных классах, даже если они находятся в других пакетах
    public String model;
    public int mileAge;
    public int volumeTank; // обьём бенза бака
    public int consumptionFuel; // расход топлива на 100km
    public int maxSpeed; // максимальная скорость
    public int weight; // вес авто
    public int capacity; // грузоподьемность

    // 1. constructor в классе
    public PracticeAutoClassObject() {   // конструктор по default (умолчанию)
    }

    // 2. constructor в классе
    public PracticeAutoClassObject(int volumeTank, int consumptionFuel, int weight, int capacity) { // constructor в классе
        this.volumeTank = volumeTank;
        this.consumptionFuel = consumptionFuel;
        this.weight = weight;
        this.capacity = capacity;
    }
    // 3. constructor в классе

    public PracticeAutoClassObject(String color, String model, int mileAge, int volumeTank, int consumptionFuel, int maxSpeed, int weight, int capacity) {
        this.color = color;
        this.model = model;
        this.mileAge = mileAge;
        this.volumeTank = volumeTank;
        this.consumptionFuel = consumptionFuel;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.capacity = capacity;
    }

    // метод
    public void move() {
        System.out.println("Авто проедет " + volumeTank / consumptionFuel * 100 + " км");
        System.out.println("Если едите с max скоростью " +maxSpeed+ " то вы проедите "+ getLengthMaxSpeed());
    }  // if (fconsumptionFuel!=0) {
    //      System.out.printin("Auto едет и проедет" + volumeTank / consumptionFuel );
    //          } else System.out.println("В баке нет топлива! ); {
    //    }


    // метод для расчета веса груза который может перевести авто
    public int getCountCargo() {
        return capacity - weight;
    }

    public int getMaxCountPassenger() { // сколько пассажиров max
        return getCountCargo() / 100; // 100 средний ввес пассажиров
    }

    // private указывает то что ненадо видеть другим обектам -> будет видно только здесь
    private double getLengthMaxSpeed(){
        return volumeTank / consumptionFuel * 100 * 0.8;
    }


}
