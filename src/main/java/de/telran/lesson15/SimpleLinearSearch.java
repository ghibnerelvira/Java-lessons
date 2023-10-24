package de.telran.lesson15;

import java.util.Arrays;

public class SimpleLinearSearch {

    // Получить от пользователя набор данных ( 6 целочисленных значений)
    // -> Сохранить полученные данные в массив
    // -> Получить от пользователя ключевой элемент
    // -> Реализовать метод линейного поиска ключевого элемента в массиве, метод должен вернуть индекс элемента или -1
    // -> Если элемент существует, вывести на консоль: Элемент в n-индексе, иначе Элемент не найден.
    // -> Проанализируйте написанный код используя режим Дебаггер
    // []{}
    public static void main(String[] args) {

        // ArrayUtils. -> добовляется для того чтобы методы были перенесины и работали в классе ArrayUtils

        int[] arrInt = {23, 10, 2, 7, 13, 8, 1, 66, 5, 9};
        System.out.println(Arrays.toString(arrInt));

        // ° примой порядок поиска
        int keySearch = 8;
        int indexSearch = ArrayUtils.searchLine(arrInt, keySearch);
        System.out.println("Key = "+keySearch+" index ="+indexSearch);
        // второй формат передачи данных в поиск
        System.out.println("Key = "+77+" index = "+ArrayUtils.searchLine(arrInt, 77));

        // ° обратный порядок поиска
        keySearch = 13;
        indexSearch = ArrayUtils.searchLineBackward(arrInt, keySearch); // если в этом классе  indexSearch = searchLineBackward(arrInt, keySearch);
        System.out.println("Key = "+keySearch+" index = "+indexSearch);



    }
//    Нужно разремлить если указывать в этом классе
//    примой порядок поиска
//    public static int searchLine(int[] arr, int key){
//       int index = -1; // есле ненайдёт вернёт -1
//       for(int i=0; i<arr.length; i++){
//           if(key == arr[i]){
//               index = i; // проверка проходит так 5==2 -> false 2==2-> true
//               break; // break ставится чтобы что он первое (вхождение) совпадение нашол и вышел. Если не укажим то  он найдёт
//                     // последний укоторый тоже совподает и остоновится на последним нахожнении
//           }
//       } return index;
//    }
//
//    // обратный порядок поиска
//    public static int searchLineBackward(int[] arr, int key){
//        int index = -1;
//        for(int i=arr.length-1; i>=0; i--){
//            if(key == arr[i]){
//                index = i;
//                break;
//            }
//        } return index;
//    }
}
