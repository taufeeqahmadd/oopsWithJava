import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Deque<String> d = new ArrayDeque<>();

        d.offer("Arvind");
        d.offer("Vimal");
        d.offer("Mukul");

        d.offerFirst("Jai");

        System.out.println(d);
    }
}

// Output:
// [Jai, Arvind, Vimal, Mukul]
