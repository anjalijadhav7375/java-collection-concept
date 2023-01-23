import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guesList = new LinkedList<>();

        guesList.add("Anjali");
        guesList.add("Rutuja");
        guesList.add("Pravin");
        guesList.add("Pratik");

        guesList.forEach(name -> System.out.println(name));
        System.out.println("2nd element of list: " + guesList.get(1));
        System.out.println("Remove 3rd element of list: " + guesList.remove(2));
        guesList.forEach(name -> System.out.println(name));

        List<String> newGuestList = new LinkedList<>();
        newGuestList.add("Swara");
        newGuestList.add("Sonali");
        newGuestList.add("Shivkanya");
        newGuestList.add("Nikita");
        guesList.addAll(newGuestList);

        System.out.println("List before Sorting: ");
        guesList.forEach(name -> System.out.println(name));
        Collections.sort(guesList);
        System.out.println("List after Sorting: ");
        guesList.forEach(name -> System.out.println(name));
    }
}