package rahkar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSum {

    public List<Integer> printPairs(List<Integer> list, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> pair = new ArrayList<Integer>();

        for (Integer element : list) {
            int temp = sum - element;
            if (temp >= 0 && set.contains(temp)) {
                pair.add(element);
                pair.add(temp);
            }
            set.add(element);
        }
        return pair;
    }
}
