package de.telran.lesson12;

public class PracticeTask2 {

    // Получите от пользователя Строку.
    // Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
    // Для решения используйте цикл и charAt() метод
    // -> Например:
    // Вход = “I don’t like rain !”
    // Bыход = I,d,o,n,t,l,i,k,e,r,a,i,n

    public static void main(String[] args) {

        String myStr = "I don’t like rain !";
        printSymbolString(myStr);

        printSymbolStringContinue(myStr);

    }
    private static void printSymbolStringContinue(String myStr) {
        int lenght = myStr.length();
        String resultStr = "";
        for(int i = 0; i < lenght; i++){
            char myChar = myStr.charAt(i);
            if(myChar=='!' || myChar==' '|| myChar=='’' || myChar=='\''){
                continue; // преревает тикуший шаг и переходит на следуйший шаг
            }
            resultStr += myChar+",";
        }
        resultStr = resultStr.substring(0,resultStr.length()-1);
        System.out.println("Bыход 2 =  "+resultStr);
    }

    private static void printSymbolString(String myStr) {
        int lenght = myStr.length();

        String resultStr = "";

        for(int i = 0; i < lenght; i++){ // начинаем с 0  -> index (1=0, 2=1, 3=2...)
            char myChar = myStr.charAt(i);
            if(myChar!='!' && myChar!=' '&& myChar!='’' && myChar!='\''){    // если неуказать то будет выгледеть ->
                                                                            // (I,  , d, o, n, ’, t,  , l, i, k, e,  , r, a, i, n,  , !, )
                // 1. Вариант
                resultStr += myChar+","; // resultStr = resultStr + (myChar+",")

                // 2. Вариант можно указать здесь: System.out.print(myChar+((i <lenght-3) ? "," : "")); // ->  I,d,o,n,t,l,i,k,e,r,a,i,n
                // если убрать -3 то будет (n,) в конце
            }
        }
        // ° 1. Вариант
        resultStr = resultStr.substring(0,resultStr.length()-1); // если убрать -1 то будет (n,) в конце
        System.out.println("Bыход =  "+resultStr); // ->  I,d,o,n,t,l,i,k,e,r,a,i,n
    }
}
