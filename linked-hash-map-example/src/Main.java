import java.security.Key;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
        * Linked --> Doubly LinkedList --> to maintain insertion order
        * Hash --> Hashing Algorithm
        * Map --> Entry --> Key, Value pairs
        */
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> cityPopulation = new LinkedHashMap<>();

        cityPopulation.put("Pune",8000000);
        cityPopulation.put("Mumbai",18000000);
        cityPopulation.put("San Francisco",8000000);

        System.out.println("Value against Pune: " + cityPopulation.get("Pune"));

        Set<Map.Entry<String,Integer>> cityPopEntries = cityPopulation.entrySet();

        for (Map.Entry<String,Integer> entry : cityPopEntries) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
            Collection<Integer> values = cityPopulation.values();
            values.forEach(value -> System.out.println("value from collection: " + value));

            Set<String> keys = cityPopulation.keySet();
            keys.forEach(key -> System.out.println("Keys from set : " + key));

            if (cityPopulation.containsKey("Pune")){
                cityPopulation.put("Pune",9000000);
            }

            if (cityPopulation.containsValue(4000000)) {
                System.out.println("The city map contains value 4M");
            }
            if (cityPopulation.isEmpty()){
                System.out.println("Map is Empty");
            }else {
                System.out.println("Map is not empty");
            }


    }
}