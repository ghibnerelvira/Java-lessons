package de.telran.lesson4;

public class Human {

    String name;
    int age;
    int weight;

    boolean isHealthy;

    void run(){
        int speed = 10; // идёт со скоросьтю 10km/h
        System.out.println(name + "с весом " + weight + "возраст " + age + "идёт! "+speed);
    }
    void sing (){
        System.out.println(name + "с весом " + weight + "возраст " + age + "поёт! ");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isHealthy=" + isHealthy +
                '}';
    }
}
