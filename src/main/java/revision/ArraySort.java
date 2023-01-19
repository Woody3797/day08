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
}
