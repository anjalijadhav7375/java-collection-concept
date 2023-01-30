import java.util.HashMap;
import java.util.Map;

/**
 * HashMap : HashMap is a data structure that stores key, value pairs.
 * Internally it uses a Node data structure that has hash, key, value, next.
 * Before java8 HashMap was purely LinkedList based.
 * In Java8, this is modified to use LinkedList and Tree(AVL Tree).
 */
public class Main {
    public static void main(String[] args) {
        Map<String , Integer> cityPopulation = new HashMap<>();

        cityPopulation.put("Pune", 1000000);
        cityPopulation.put("Mumbai", 1800000);
        cityPopulation.put("Nyc", 1200000);
        cityPopulation.put("London", 4000000);

        System.out.println("Population of Nyc: " + cityPopulation.get("Nyc"));

    for (Map.Entry<String,Integer> entry : cityPopulation.entrySet()) {
        System.out.println("Name of city: " + entry.getKey() + " Population of City: " + entry.getValue());
        }

        for (Integer population : cityPopulation.values()) {
            System.out.println(population);
        }

        for (String name : cityPopulation.keySet()) {
            System.out.println(name);
        }

        Object[] keys = cityPopulation.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            System.out.println(" " + keys[i]);
        }
        System.out.println();

        System.out.println("Hash map elements in an toString: " + cityPopulation.keySet().toString());

        if (cityPopulation.containsKey("Pune")) {
            cityPopulation.put("Pune" , 9000000);
        }
        if (cityPopulation.containsValue(400000)){
            System.out.println("The city map contains value 4M");
        }

        if (cityPopulation.isEmpty()){
            System.out.println("Map is empty");
        }else {
            System.out.println("Map is not empty");
        }
        System.out.println("Size of Map is: " + cityPopulation.size());
    }
}