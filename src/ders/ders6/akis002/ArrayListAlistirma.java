package src.ders.ders6.akis002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAlistirma {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Java");
        arrList.add("Python");
        arrList.add("C++");
        arrList.add("Java");

        System.out.println("ArrayList icindeki elemanlar: " + arrList);
        arrList.add(1, "JavaScript");
        System.out.println("ArrayList icindeki elemanlar: " + arrList);

        List<String> newList = Arrays.asList("C#", "Rust");
        arrList.addAll(newList);
        //arrList.clear();
        System.out.println("ArrayList icindeki elemanlar: " + arrList);

        //arrList.remove("Java");
        //arrList.removeAll(Collections.singleton("Java"));
        //arrList.remove(3);

        String str = arrList.get(3);
        System.out.println(str);

        System.out.println(arrList.indexOf("Rust"));
        System.out.println(arrList.indexOf("Rust1"));
        System.out.println(arrList.size());
        System.out.println(arrList.isEmpty());
        System.out.println(arrList.contains("Rust"));


        arrList.addFirst("Kotlin");

        for (String element : arrList){
            System.out.println(element);
        }
        System.out.println(arrList.getFirst());

    }
}
