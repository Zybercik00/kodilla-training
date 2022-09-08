package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    };
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    };

    @DisplayName("This test case verifies the operation of the empty list.")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        // given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>()); // List.of()

        // then
        Assertions.assertEquals(new ArrayList<>(), result);
    }
    @DisplayName("This test case verifies the operation of a list containing even numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        // given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(List.of(3, 5, 6, 8, 9, 11));

        // then
        Assertions.assertEquals(List.of(6, 8), result);
    }
}
