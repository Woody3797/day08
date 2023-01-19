package revision;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    
    public void example() {
        String[] name = {"tom", "john", "wes", "bob", "mark", "pam", "marc"};

        // print out unsorted array
        System.out.println(Arrays.toString(name));

        // sort in ascending order
        Arrays.sort(name);

        // print out array
        System.out.println(Arrays.toString(name));

        // sort in descending order
        Arrays.sort(name, Collections.reverseOrder());

        // print out reverse sorted array
        System.out.println(Arrays.toString(name));
    }


    public void example2() {
        int[] nums = {34, 23, 53, 29, 10, 4, 69, 123, 5, 24};

        // sort array in ascending order
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        // sort in descending order
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
}
