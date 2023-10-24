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
}