import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(10);

        System.out.println("Peek: " + integers.peek());
        System.out.println("Pop: " + integers.pop());
        System.out.println("Is empty: " + integers.isEmpty());
    }
}