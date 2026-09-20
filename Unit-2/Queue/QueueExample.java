import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println(queue);

        System.out.println("Head: " + queue.peek());

        System.out.println("Removed: " + queue.remove());

        System.out.println("After removal: " + queue);

        System.out.println("Is empty? " + queue.isEmpty());
    }
}


// Output approximately:
// [Alice, Bob, Charlie]
// Head: Alice
// Removed: Alice
// After removal: [Bob, Charlie]
// Is empty? false
