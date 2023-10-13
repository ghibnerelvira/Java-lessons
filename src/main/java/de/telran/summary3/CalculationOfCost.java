package de.telran.summary3;

public class CalculationOfCost {

    // Расчёт стоимости товара  с учетом скидки:
    // -> Создать программу для расчета стоимости товара с учетом скидки 5000.
    // -> Если сумма покупки больше определенного значения примените скидку 10 % (discount)
    // : (else)
    public static void main(String[] args) {

        System.out.println("Ценна со скидкой: "+getResultPrice(10000,10,5000));
    }

    private static int getResultPrice (int price, int discount, int limit) {
        return price > limit ? price * (100-discount)/100 : price;
        // 2. вариант
        // if (price > limit){
        //    return price * (100-discount)/100;
        // }else {
        //    return price;
        // }
    }

}
