package revision;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public void example() {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");
        ll.add("H");

        // printing out each item (lambda)
        ll.forEach(i -> System.out.println(i));

        ll.remove("C");
        ll.removeFirst();
        ll.removeLast();
    }
}
