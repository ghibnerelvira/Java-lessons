package de.telran.summary2;

public class TestingMethod {
    public static void main(String[] args) {


        char a = 'A';
        System.out.println(a++); // B
        System.out.println(a+1); // 66 + 1 = 67
        System.out.println((char)(a+1)); // C

        String s = "1000";
        int i = Integer.parseInt(s);
        int i2 = i * 20;
        Integer i3 = i2; // превратить в число

        String s2 = String.valueOf(i2); // превпатить в строку
        s2 = i2 + "20";
        s2 = i3.toString();

        System.out.println("diagonalRectangle 1 = "+diagonalRectangle(10,5));
        System.out.println("diagonalRectangle 2 = "+diagonalRectangle(8,8));
        System.out.println("squareRectangle = "+squareRectangle(4,8));
        System.out.println("perimeterRectangle = "+perimeterRectangle(10,15));
        System.out.println("perimeterCircle = "+perimeterCircle(20));
        System.out.println("getPerimeter = "+getPerimeter(2,3,5));
        System.out.println("getSquare(Площадь) = "+getSquare(4,9,7));
    }


    // 1.
    // Напишите методы, которые под двум заданным сторонам
    // вычисляют  диагональ прямоугольника, его площадь и периметр.
    // -> Напишите методы нахождения периметра и площади для для круга и треугольника.

    static double diagonalRectangle (int width, int height){
            return Math.sqrt(width * width + height * height);
    }

    static double squareRectangle (int width, int height){
        return width * height;
    }

    static double perimeterRectangle (int width, int height){
        return 2*width+ 2*height;
    }

    static double perimeterCircle (int radius){
        return 2 * Math.PI * radius;
    }

    static double getPerimeter (double a, double b, double c){
        return a + b + c;
    }

    static double getSquare (double a, double b, double c){
        double p = getPerimeter(a, b, c) / 2;  // S = √p · (p — a)(p — b)(p — c),
        System.out.println("Полупериметр: "+ p);
        return Math.sqrt( p * (p - a)*(p - b)*(p - c));
    }


}
