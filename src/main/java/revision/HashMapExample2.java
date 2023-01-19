package revision;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample2 {
    
    public void example() {

        Map<String, Integer> pc = new ConcurrentHashMap<>();

        pc.put("dell", 1000);
        pc.put("acer", 500);
        pc.put("lenovo", 750);
        pc.put("sony", 1335);
        pc.put("asus", 2000);

        // get total size of map objects
        System.out.println(pc.size());

        // iterate through map using keySet method
        for (String key : pc.keySet()) {
            System.out.println(key + " -- " + pc.get(key));
        }

        String searchString = "asus";
        if (pc.containsKey(searchString)) {
            System.out.println(searchString + " -- " + pc.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) pc).elements();

        while (elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer returnValue = pc.putIfAbsent("asus", 3000);
        if (returnValue != null) {
            System.out.println("item found " + returnValue);
        }

        returnValue = pc.putIfAbsent("microsoft", 3000);

    }
}
