import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Anjali");
        guestList.add("Rutuja");
        guestList.add("Pravin");
        guestList.add("Neha");

        guestList.forEach(name -> System.out.println(name));

        System.out.println("Element at 2nd index: " + guestList.get(1));
        System.out.println("Remove 0th index element: " + guestList.remove(0));
        guestList.forEach(name -> System.out.println(name));

        Stream<String> stringStream = guestList.stream();

        System.out.println("After filter the stream elements are : ");
        stringStream.filter(name -> name.length() == 4)
        .forEach(name -> System.out.println(name));
    }
}