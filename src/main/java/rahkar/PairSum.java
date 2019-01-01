package rahkar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSum {

    private static void printPairs(List<Integer> list, int sum) {
        Set<Integer> set = new HashSet<Integer>();

        for (Integer element : list) {
            int temp = sum - element;
            if (temp >= 0 && set.contains(temp)) {
                System.out.println("Pair with given sum: " + element + ", " + temp);
            }
            set.add(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 3, 8, 12, 15, 17, 25, 80, 145, 156
        );
        int x = 157;
        printPairs(numbers, x);
    }
}
