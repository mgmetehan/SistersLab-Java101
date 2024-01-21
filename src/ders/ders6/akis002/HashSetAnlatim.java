package src.ders.ders6.akis002;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAnlatim {
    public static void main(String[] args) {
        HashSet<String> ornekHash = new HashSet<>();
        ornekHash.add("Java");
        ornekHash.add("C");
        ornekHash.add("GO");
        ornekHash.add("Python");
        ornekHash.add("Java");

        System.out.println(ornekHash);

/*        for (String element : ornekHash){
            System.out.println(element);
        }*/

        ornekHash.add("C++");

        ornekHash.remove("Java");
        ornekHash.clear();


        Iterator<String> iterator = ornekHash.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(ornekHash.contains("C"));





    }
}
