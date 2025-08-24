import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> Map = new HashMap<>();
        Map.put(22, "Pritam");
        Map.put(19, "Ram");
        Map.put(20, "Shyam");
        Map.put(21, "Sita");
        System.out.println(Map);
        System.out.println(Map.containsKey(22));

        for(int i :Map.keySet())
            System.out.println(Map.get(i));
    }
}