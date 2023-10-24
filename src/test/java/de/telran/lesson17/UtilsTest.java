package de.telran.lesson17;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    // Создайте метод getNumbers();
    // Метод должен возвращать массив из трех целочисленных значений: [1, 2, 3]
    // Вызовите метод в main()
    // Убедитесь, что метод работает верно

    Utils testUtils;
    int[] actualArr;

    @BeforeEach
    void init(){
        testUtils = new Utils();
    }

    @AfterEach
    void destroy(){
        testUtils = null;
    }
    @Test
    void getNumbersTest() {
        int expLenght = 3;
        int[] expArr = {1,2,3};

        actualArr = testUtils.getNumbers();

        Assertions.assertEquals(expLenght, actualArr.length);
        Assertions.assertArrayEquals(expArr, actualArr);
    }



    @Test
    void getNumbersTestLenghtArray() { // тестирует размер массива
        int expLenght = 3;

        actualArr = testUtils.getNumbers();

        Assertions.assertEquals(expLenght, actualArr.length);

    }
    @Test
    void getNumbersTestContentArray() { // тестирует содержимое массива
        int[] expArr = {1,2,3};

        actualArr = testUtils.getNumbers();

        Assertions.assertArrayEquals(expArr, actualArr);
    }

    // тест, который проверяет пустой массив или нет
    // тест, который проверяет правильность поиска максимального значения
    @Test
    void findMaxTestEmptyArray() {
        int expResult = Integer.MIN_VALUE;
        int[] expEmptyArray = new int[0];
        int actualMax= testUtils.findMax(expEmptyArray);
        // Если мы передодим пустой массив или null
        Assertions.assertEquals(expResult, actualMax);

    }

    @Test
    void findMaxTestTrueMaxValue() {
        int expResult = 8;
        int[] expArray = {1,3,8,2,4};
        int actualMax= testUtils.findMax(expArray);
        // Если мы передодим пустой массив или null
        Assertions.assertEquals(expResult, actualMax);

    }
}