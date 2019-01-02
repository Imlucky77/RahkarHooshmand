package rahkar;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicateNumbersTest {

    @Test
    public void test_findDuplicateNumbers() {
        List<Integer> numbers = Arrays.asList(
                1, 5, 4, 7, 9, 8, 3, 6, 8, 2, 3
        );

        DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
        List<Integer> checkList = duplicateNumbers.findDuplicateNumbers(numbers);

        List<Integer> expected = Arrays.asList(8, 3);
        assertEquals(expected, checkList);

        System.out.println(expected);
    }
}
