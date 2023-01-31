import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();

        integers.add(10);

        System.out.println(integers.get(0));
        System.out.println(integers.remove(0));
        System.out.println(integers.isEmpty());
    }
}