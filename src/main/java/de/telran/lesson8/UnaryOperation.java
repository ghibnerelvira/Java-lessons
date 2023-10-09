package de.telran.lesson8;

public class UnaryOperation {
    public static void main(String[] args) {

        // Уннарнные операторы

        int myInt = 10;
        System.out.println("myInt = "+myInt);

        // 1.
        myInt++; //  dikriment или ->  myInt = myInt + 1;
        System.out.println("myInt++ = "+myInt);

        // 2.
        myInt--; // inkrement  или ->  myInt = myInt - 1;
        System.out.println("myInt-- = "+myInt);

        //Декремент (--):
        //он используется для уменьшения значения целого числа.
        // Его можно использовать двумя отдельными способами:
        //Оператор постдекремента: При размещении после имени переменной
        // значение операнда уменьшается, но предыдущие значения временно
        // сохраняются до выполнения этого оператора и обновляются перед
        // выполнением следующего оператора.

        // 3. посфикснный дикремент
        int myInt2 = 15;
        printNumber(myInt2++);
        // -> static void.... -> System.out.println(myInt2); = чтобы было преплюсовано = результат

        // 4. префиксный эктримент
        int myInt3 = 15;
        printNumber(++myInt3); // printNumber(--myInt3)
        // -> сначало ++ увеличивает и после -> static void... = результат


        // или
        System.out.println("myInt++ = " +myInt2++);
        System.out.println(myInt2);

        System.out.println("++myInt = " +(++myInt2));
        System.out.println(myInt2);


        myInt += 2; // ->  myInt = myInt + 2;
        myInt -= 3; // ->  myInt = myInt - 3;
        myInt /= 2; // ->  myInt = myInt / 2;
        myInt *= 5; // ->  myInt = myInt * 5;
        myInt %= 2; // ->  myInt = myInt % 2;

        int a1=5, a2=2;
        System.out.println("Sum1 = "+sum(5,8));
        System.out.println("Sum2 = "+sum(a1,a2));
        System.out.println("Sum3 = "+sum(++a1,a2));
        System.out.println("Sum4 = "+a1);
    }
     static void printNumber(int number) {
         System.out.println("printNumber() = "+number);
     }

     static int sum (int arg1, int arg2){
        return arg1 + arg2;
     }

}
