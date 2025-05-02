package abctech.interview.tasks.arrayutil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperationsTests {
    ArrayOperations arrayOperations;
    ArrayList<Integer> testArray;

    @BeforeEach
    void setupBeforeEach() {
        arrayOperations = new ArrayOperations();
        testArray = new ArrayList<>(Arrays.asList(6, -16, 19));
    }

    @Test
    @DisplayName("Sum of all array elements")
    void testArraySum() {
        int result = arrayOperations.arraySum(testArray);
        Assertions.assertEquals(9, result);
    }

    @Test
    @DisplayName("Array sort")
    void testSortArray() {
        ArrayList<Integer> expectedArrayAsc = new ArrayList<>(Arrays.asList(-16, 6, 19));
        arrayOperations.sortArray(testArray);

        Assertions.assertArrayEquals(expectedArrayAsc.toArray(), testArray.toArray());

    }

    @Test
    @DisplayName("Minimum value in array")
    void arrayMin() {

        Assertions.assertEquals(-16, arrayOperations.arrayMin(testArray));
    }

    @Test
    @DisplayName("Maximum value in array")
    void arrayMax() {
        Assertions.assertEquals(19, arrayOperations.arrayMax(testArray));
    }

    @Test
    @DisplayName("Arithmetic value of array")
    void testArrayAverage() {
        Assertions.assertEquals(3, arrayOperations.arrayAverage(testArray));
    }
}
