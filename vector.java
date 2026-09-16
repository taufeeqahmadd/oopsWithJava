import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>(5,4);
        v.add("apple");
        v.add("orange");
        v.add("pear");
        v.add("grape");
        v.add("banana");
        v.add("kiwi");

        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
