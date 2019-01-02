package rahkar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

    public List<Integer> findDuplicateNumbers(List<Integer> numbers) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();

        for (Integer element : numbers) {
            if (!set.add(element)) {
                duplicates.add(element);
            }
        }
        return duplicates;
    }
}
