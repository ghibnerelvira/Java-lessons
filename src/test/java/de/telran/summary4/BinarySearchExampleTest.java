package de.telran.summary4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class BinarySearchExampleTest {

    private static Stream<Arguments> getPositiveDateTest() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 6}, 4, 1),
                Arguments.of(new int[]{3, 4, 5, 6}, 0, -1)

        );
    }

    @ParameterizedTest
    @MethodSource("getPositiveDateTest")
    void binSearchTestPositiveCases(int[] arr, int findMe, int expected) {
        int actual = BinarySearchExample.binSearch(arr, findMe);
        assertEquals(expected, actual);

    }

    //не параметризированый тест
    @Test
    void binSearchTestPositiveCases1() {
        int[] arr ={3, 4, 5, 6};
        int findMe = 0;
        int expected = -1;
        int actual = BinarySearchExample.binSearch(arr, findMe);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void binSearchTestNegativeCases(int[] arr){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BinarySearchExample.binSearch(arr, 0);
        });

        String expectedMessage = "Передан пустой массив (Empty array received)";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}