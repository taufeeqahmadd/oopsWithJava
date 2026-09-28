import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,Integer> names = new java.util.HashMap<>();
        names.put("Akul",1);
        names.put("Aman",2);
        names.put("Arav",3);
        System.out.println(names);
        System.out.println(names.get("Akul"));
        for(Map.Entry<String,Integer> name: names.entrySet()){
            System.out.println(name.getKey()+" "+name.getValue());

        }
    }
}
