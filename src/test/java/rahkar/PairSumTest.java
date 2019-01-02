package rahkar;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PairSumTest {

    @Test
    public void test_pairSum() {
        PairSum pairSum = new PairSum();
        List<Integer> numbers = Arrays.asList(
                1, 3, 8, 12, 15, 17, 25, 80, 145, 156
        );
        int x = 25;

        List<Integer> integers = pairSum.printPairs(numbers, x);
        assertEquals(Arrays.asList(17, 8), integers);

        System.out.println(integers);
    }
}
