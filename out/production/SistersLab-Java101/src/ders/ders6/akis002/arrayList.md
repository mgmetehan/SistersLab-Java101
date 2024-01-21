# Java'da ArrayList Sinifi

## 1. Giris

Java'da `ArrayList`, `List` arabirimini uygulayan bir siniftir ve dinamik bir dizi (dynamic array) olarak kullanilir. `ArrayList`, eleman ekledikce veya cikardikca boyutu otomatik olarak ayarlanabilen bir koleksiyon sinifidir. Bu dokuman, `ArrayList` sinifinin temel ozelliklerini, kullanimini ve yaygin olarak kullanilan metodlarini detayli bir sekilde anlatir.

## 2. ArrayList Olusturma

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // ArrayList olustur
        List<String> arrayList = new ArrayList<>();

        // Elemanlari ekle
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        // ArrayList icindeki elemanlari ekrana yazdir
        System.out.println("ArrayList icindeki elemanlar: " + arrayList);
    }
}
```

Yukaridaki ornekte, `ArrayList` sinifindan bir ornek olusturulur ve elemanlar bu liste icine eklenir.

## 3. ArrayList Ozellikleri

- **Dinamik Boyut:** Eleman ekledikce veya cikardikca boyut otomatik olarak ayarlanir.
- **Dongusel Erisim:** Elemanlara dizin numarasi ile dogrudan erisim saglar.
- **Null Degerler:** `null` degerler icerebilir.
- **Sirali Elemanlar:** Elemanlar eklenme sirasina gore tutulur.

## 4. ArrayList Metodlari

### 4.1. Eleman Ekleme ve Cikarma

- **add(E element):**
    - `ArrayList`'e yeni bir eleman ekler.

    ```java
    arrayList.add("Java");
    ```

- **add(int index, E element):**
    - Belirtilen dizine eleman ekler. Dizindeki diger elemanlar saga kaydirilir. Ara eleman eklemek icin kullanilir.

    ```java
    arrayList.add(1, "JavaScript");
    ```

- **addAll(Collection<? extends E> c):**
    - Belirtilen koleksiyonun tum elemanlarini `ArrayList`'e ekler.

    ```java
    List<String> otherList = Arrays.asList("C#", "Swift");
    arrayList.addAll(otherList);
    ```

- **remove(Object o):**
    - Belirtilen elemani `ArrayList`'den kaldirir.

    ```java
    arrayList.remove("Java");
    ```

- **remove(int index):**
    - Belirtilen dizindeki elemani kaldirir.

    ```java
    arrayList.remove(0);
    ```

### 4.2. Eleman Erisimi

- **get(int index):**
    - Belirtilen dizindeki elemani getirir.

    ```java
    String element = arrayList.get(0);
    ```

- **indexOf(Object o):**
    - Belirtilen elemanin ilk bulundugu dizini dondurur.

    ```java
    int index = arrayList.indexOf("Python");
    ```

- **size():**
    - `ArrayList`'in eleman sayisini dondurur.

    ```java
    int size = arrayList.size();
    ```

### 4.3. Diger Metodlar

- **clear():**
    - `ArrayList`'in tum elemanlarini kaldirir.

    ```java
    arrayList.clear();
    ```

- **isEmpty():**
    - `ArrayList` bos mu degil mi kontrol eder.

    ```java
    boolean empty = arrayList.isEmpty();
    ```

- **contains(Object o):**
    - Belirtilen elemanin `ArrayList` icinde olup olmadigini kontrol eder.

    ```java
    boolean containsJava = arrayList.contains("Java");
    ```

- **toArray():**
    - `ArrayList`'i bir diziye donusturur.

    ```java
    Object[] array = arrayList.toArray();
    ```

## 5. ArrayList Iterasyon

```java
// ArrayList uzerinde iterasyon
System.out.println("ArrayList uzerinde iterasyon:");
for (String element : arrayList) {
    System.out.println(element);
}
```
