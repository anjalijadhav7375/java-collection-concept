import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guesList = new ArrayList<>();
        guesList.add("Anjali");
        guesList.add("Rutuja");
        guesList.add("Pravin");
        guesList.add("Pratik");

        Collections.sort(guesList);
        guesList.forEach(name -> System.out.println(name));

        Integer[] evenNum = {2,4,6,8,10};
        Arrays.sort(evenNum);
        for (int i: evenNum) {
            System.out.println(" "+ i);
        }
    }
}