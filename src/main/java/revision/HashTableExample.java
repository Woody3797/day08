package revision;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    
    public void example() {

        // hashtable and hashmap is the same, but hashtable is legacy, so use hashmap instead
        Map<String, Integer> phones = new Hashtable<>();

        phones.put("iphone", 1);
        phones.put("oppo", 25);
        phones.put("huawei", 32);
        phones.put("poco", 14);

        System.out.println(phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + " -- " + phones.get(key));
        }

        String searchString = "";
        Console cons = System.console();

        while (!searchString.equalsIgnoreCase("quit")) {
            searchString = cons.readLine("enter searchstring: ");
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " -- " + phones.get(searchString));
            } else {
                System.out.println("item not found");
            }
        }

        // remove all map data and check for size of map
        phones.clear();
        System.out.println(phones.size());

    }
}
