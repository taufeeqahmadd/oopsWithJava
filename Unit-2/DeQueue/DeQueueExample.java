import java.util.*;

public class DeQueueExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add("B");
        deque.add("C");

        deque.addFirst("X");
        deque.addLast("Y");

        System.out.println(deque);
      
    }
}

// Output - 
// X → A → B → C → Y
