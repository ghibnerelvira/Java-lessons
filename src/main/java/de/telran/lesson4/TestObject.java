package de.telran.lesson4;

public class TestObject {
    public static void main(String[] args) {
        Human hm1 = new Human(); // hm-> human1
        hm1.weight = 3;
        hm1.age = 1;
        hm1.name = "Вася";
        System.out.println("Original1= "+hm1);

        //копия (как одна квартира с разным подвалом)
        Human hmCopy = hm1;
        hm1.isHealthy =true;
        System.out.println("Copy1= "+hmCopy);

        //копия (как одна квартира с одним подвалом)
        hm1.age =20;
        hm1.weight = 70;
        hmCopy.isHealthy = true;

        System.out.println("Original2= "+hm1);
        System.out.println("Copy2= "+hmCopy); // копирование ссылки

        Human hm2 = new Human();
        hm2.weight = 30;
        hm2.age = 50;
        hm2.name = "Лена";
        hm2.isHealthy = true;
        System.out.println("Original->hm2= "+hm2);

    }
}
