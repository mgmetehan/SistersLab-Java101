package src.ders.ders6.akis002;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkendHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);


        System.out.println(set);


        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
