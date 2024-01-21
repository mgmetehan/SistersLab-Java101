# Java'da LinkedHashSet Sinifi

## 1. LinkedHashSet Nedir?

`LinkedHashSet`, Java'da `Set` arabirimini uygulayan bir siniftir ve elemanlari eklenme sirasina gore tutar. Bu sinif, `HashSet`'in benzersiz elemanlari ve hizli erisim avantajini korurken, ayni zamanda elemanlarin eklenme sirasini hatirlar.

`LinkedHashSet` sinifi, bir cift bagli liste (doubly linked list)(kendinden onceki ve sonraki indexi bilir) ve bir hash tablosu kombinasyonu kullanarak elemanlari depolar. Bu nedenle, elemanlar eklendikleri sirayla gezilebilir.

## 2. LinkedHashSet Olusturma

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // LinkedHashSet olustur
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Elemanlari ekle
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");

        // LinkedHashSet icindeki elemanlari ekrana yazdir
        System.out.println("LinkedHashSet icindeki elemanlar: " + linkedHashSet);
    }
}
```

Yukaridaki ornekte, `LinkedHashSet` sinifindan bir ornek olusturulur ve elemanlar eklenme sirasina gore eklenir.

## 3. LinkedHashSet Ozellikleri

- **Sirali Ekleme:** Elemanlar eklenme sirasina gore tutulur.
- **Benzersiz Elemanlar:** Ayni eleman bir kez eklenir ve tekrar eklenmez.
- **Hizli Erisim:** Elemanlara hizli erisim saglayan bir hash tablosu kullanir.

## 4. LinkedHashSet Iterasyon

```java
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIteration {

    public static void main(String[] args) {
        // LinkedHashSet olustur
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Elemanlari ekle
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // LinkedHashSet uzerinde iterasyon
        System.out.println("LinkedHashSet uzerinde iterasyon:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```
