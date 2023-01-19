package revision;

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

        CollectionSort numarr = new CollectionSort();
        numarr.example();
    }
}
