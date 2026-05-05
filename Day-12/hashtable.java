import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> x = new Hashtable<>();
        x.put(101, "first");
        x.put(202, "second");
        x.put(303, "third");
        System.out.println(x);
        x.remove(202);
    }           
}
