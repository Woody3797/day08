package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

    public void example() {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println(nums);

        // sort in ascending
        Collections.sort(nums);

        System.out.println(nums);

        // sort in descending
        Collections.sort(nums, Collections.reverseOrder());

        System.out.println(nums);

    }

}
