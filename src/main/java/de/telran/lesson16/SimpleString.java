package de.telran.lesson16;

public class SimpleString {
    public static void main(String[] args) {
        // обектный тип ( с большой буквы)
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        // сравнивает Adrees -> в памети
        System.out.println("s1==s2 -> "+(s1==s2)); // true
        System.out.println("s1==s3 -> "+(s1==s3)); // false, так-как Adress другой
        // сравнивает содержимое где содержится "Cat"
        System.out.println("s1.equals(s2) -> "+(s1.equals(s2))); // true
        System.out.println("s1.equals(s3) -> "+(s1.equals(s3))); // true

        System.out.println(); // пробел
        // пересвоить значение (изеняем)
        /*  s1 = " 2 Cats";
        System.out.println("s1==s2 -> "+(s1==s2)); // false
        System.out.println("s1.equals(s2) -> "+(s1.equals(s2))); // false
        System.out.println("s1 -> "+s1);
        System.out.println("s2 -> "+s2);*/

        // помешение в Poll из Heap
        s3 = s3.intern(); // из Heap создает в Poll отдельную эчейку и добовляет ( из Heap  уберается)
        System.out.println("s1==s3 -> "+(s1==s3)); // true
        System.out.println("s1.equals(s3) -> "+(s1.equals(s3))); // true

        // извлечение из  Poll  в Heap
        s2 = new String(s2); // cоздается новый адресс -> меняется формат хранение создается с Poll -> отдельно в  Heap
        System.out.println("s1==s2 -> "+(s1==s2)); // false
        System.out.println("s1.equals(s2) -> "+(s1.equals(s2))); // true

        // вырезает слово -> Я люблю !
        String s4 = "Я люблю Java!";
        s4 = s4.substring(0,8)+s4.substring(12, s4.length());
        // 2. Вриант -> заменить на пустое место
        s4 = s4.replace("Java","");
        System.out.println(s4);
    }
}
