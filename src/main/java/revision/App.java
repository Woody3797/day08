package revision;

import java.util.HashMap;
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

        ArraySort arr = new ArraySort();
        arr.example();
        arr.example2();

        CollectionSort numarr = new CollectionSort();
        numarr.example();
        numarr.example2();

        HashMapExample2 chme = new HashMapExample2();
        chme.example();

    }
}
