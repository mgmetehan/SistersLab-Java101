# Java'da Map ve HashMap Koleksiyonlari

## 1. Map ve HashMap Nedir?

Java'da `Map` arabirimi, anahtar-deger (key-value) ciftlerini depolayan bir koleksiyonu temsil eder. Bu ciftler, birbirinden farkli anahtarlar araciligiyla benzersiz bir sekilde tanimlanir. `Map` koleksiyonlari, genellikle verileri etkili bir sekilde depolamak ve erismek icin kullanilir. `HashMap` ise, `Map` arabirimini uygulayan ve anahtar-deger ciftlerini depolayan bir siniftir. Performans acisindan etkili bir sekilde calisir ve genellikle Java'da en yaygin kullanilan `Map` implementasyonlarindan biridir.

## 2. Map Arabirimi Ozellikleri

- **Benzersiz Anahtarlar:** Bir `Map` icinde her anahtar yalnizca bir kez bulunabilir.
- **Null Degerler:** Hem anahtarlar hem de degerler `null` degerlerini icerebilir.
- **Coklu Degerler:** Bir anahtar birden fazla degeri temsil edebilir (ornegin, `List` gibi).

## 3. HashMap Olusturma

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // HashMap olustur
        Map<String, Integer> hashMap = new HashMap<>();

        // Anahtar-deger ciftleri ekle
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);

        // HashMap icindeki ciftleri ekrana yazdir
        System.out.println("HashMap icindeki ciftler: " + hashMap);
    }
}
```

Yukaridaki ornekte, `HashMap` sinifindan bir ornek olusturulur ve anahtar-deger ciftleri eklenir.

## 4. HashMap Ozellikleri

- **Sirasiz:** Anahtarlar ve degerler ekleme sirasina gore siralanmaz.
- **Hizli Erisim:** Anahtarlarla degerlere hizli erisim saglar.
- **Dinamik Boyut:** Eleman ekledikce veya cikardikca boyut otomatik olarak ayarlanir.
- **Null Degerler:** Hem anahtarlar hem de degerler `null` degerini icerebilir.

## 5. HashMap Metodlari

### 5.1. Anahtar-Deger Ekleme ve Cikarma

- **put(K key, V value):**
    - Belirtilen anahtar-deger ciftini `HashMap`'e ekler.

      ```java
      hashMap.put("JavaScript", 4);
      ```

- **remove(Object key):**
    - Belirtilen anahtara karsilik gelen degeri kaldirir.

      ```java
      hashMap.remove("Python");
      ```

### 5.2. Deger ve Anahtar Erisimi

- **get(Object key):**
    - Belirtilen anahtara karsilik gelen degeri dondurur.

      ```java
      Integer value = hashMap.get("Java");
      ```

- **containsKey(Object key):**
    - Belirtilen anahtarin `HashMap` icinde olup olmadigini kontrol eder.

      ```java
      boolean containsJava = hashMap.containsKey("Java");
      ```

### 5.3. Diger Metodlar

- **size():**
    - `HashMap`'in icindeki anahtar-deger ciftlerinin sayisini dondurur.

      ```java
      int size = hashMap.size();
      ```

- **isEmpty():**
    - `HashMap` bos mu degil mi kontrol eder.

      ```java
      boolean isEmpty = hashMap.isEmpty();
      ```

## 6. HashMap Iterasyon

```java
        // keySet() kullanarak iterasyon
        System.out.println("keySet() ile HashMap uzerinde iterasyon:");
        for (String key : hashMap.keySet()) {
        System.out.println("Anahtar: " + key + ", Deger: " + hashMap.get(key));
        }

        // values() kullanarak iterasyon
        System.out.println("\nvalues() ile HashMap uzerinde iterasyon:");
        for (Integer value : hashMap.values()) {
        System.out.println("Deger: " + value);
        }
```
