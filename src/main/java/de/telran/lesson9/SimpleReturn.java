package de.telran.lesson9;

public class SimpleReturn {
    public static void main(String[] args) {

        int arg1 = 10, arg2 = 0;
        System.out.println("arg1 = " +arg1+ " arg2 = "+arg2);

        div(arg1, arg2);
        // или
        //1.
        int res = divReturn(arg1, arg2);
        System.out.println("Main result = "+res);

        // 2.
        System.out.println("Expression =  "+divReturn(arg1, arg2)*10);
    }

    static void div(int par1, int par2){
        if(par2 == 0){  // на ноль делить нельзя (в некоторых случиях)
                        // -> ну чтобы программа неупала
                        // ->нужна указывать if(..) чтобы программа return(возврвшала)
            System.out.println("На ноль делить нельзя ");
            return;
        }
        int result = par1 / par2;
        System.out.println("result = "+result);
    }

    // или

    static int divReturn(int par1, int par2){
        if(par2 == 0){
            return Integer.MIN_VALUE; // возврашает минимальное значение
        }
        int result = par1 / par2;
        return result;
    }
}
