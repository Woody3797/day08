package revision;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public void example() {

        Stack<Integer> stack = new Stack<>();

        // push something on stack
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // pop something from the stack
        for (int i = 0; i < 3; i++) {
            Integer stackItem = stack.pop();
            System.out.println("pop item: " + stackItem);
        }

        // see last item on top of stack
        Integer stackTop = stack.peek();
        System.out.println(stackTop);

        // get first element of stack
        Integer firstItem = stack.firstElement();
        System.out.println(firstItem);

        // search for an item in stack and returns the index where it is found
        Integer idxElement = stack.search(2);
        System.out.println("stack item found at " + idxElement);

        // iterating through a stack
        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("iterator stack item: " + stackIt);
        }
    }
}
