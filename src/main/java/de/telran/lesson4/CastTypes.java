package de.telran.lesson4;

public class CastTypes {
    public static void main(String[] args) {

        byte myByte = 15;
        int myInt = myByte; // содержимое 15 с маленькой коропки byte(8.bytes) ложит в большую int(32.bytes)

        System.out.println("myByte = "+myByte);
        System.out.println("myInt =  "+myInt);

        short myShort = (short)myInt; //содержимое 15 с большую  коропки short ложит в маленькой int(32.bytes)
        System.out.println("myShort= "+myShort);

        int myIntBig = 1_000_000; // из за того что с большой ставишь в  черешюр маленикую -> показывает результат не маленький
        myShort =(short) myIntBig; //  указывает что мы явно это хотим и уверены что поместится
        System.out.println("myShort= "+myShort);

        double myDbl = myIntBig; // одинаковые коробки
        System.out.println("myDbl= "+myDbl);

        float myFloat = myIntBig; // одинаковые коробки
        System.out.println("myFloat= "+myFloat);

        // метод 1
        char mySymbol = 'd';
        System.out.println("mySymbol=  "+mySymbol);

        // метод 2
        int mySymbolInt ='d';
        System.out.println("mySymbolInt= "+mySymbolInt); // показывает символ unicode

        // метод 3
        char mySymbol1 = 100;
        System.out.println("mySymbol 1 = "+mySymbol1);

        // метод 4
        char mySymbol2 = 100+25;
        System.out.println("mySymbol 2 = "+mySymbol2);

        // метод 5
        char mySymbol3 = (char)mySymbolInt;
        System.out.println("mySymbol 3 = "+mySymbol3);




    }
}
