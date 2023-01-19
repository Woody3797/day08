package revision;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        CollectionSort cs = new CollectionSort();
        cs.example2();

        HashMapExample2 chme = new HashMapExample2();
        chme.example();

        LinkedListExample list = new LinkedListExample();
        list.example();

        StackExample se = new StackExample();
        se.example();

    }
}
