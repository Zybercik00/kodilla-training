package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] numbers = new int[] {2, 8, 1};
        // when
        double result = ArrayOperations.getAverage(numbers);
        //then
        Assertions.assertEquals(3.666, result, 0.001);
    }
}