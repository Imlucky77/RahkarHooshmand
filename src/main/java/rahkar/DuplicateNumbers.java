package rahkar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 5, 4, 7, 9, 8, 3, 6, 8, 2, 3
        );

        Set<Integer> set = new HashSet<Integer>();

        for (Integer element : numbers) {
            if (!set.add(element)) {
                System.out.println("Duplicate: " + element);
            }
        }
    }
}
