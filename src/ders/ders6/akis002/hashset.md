# Java'da Set Arabirimi ve HashSet Sinifi

## 1. Set Arabirimi Nedir?

Java'da, `Set` arabirimi, bir kume (set) veri yapisini temsil eder. Bu arabirim, benzersiz elemanlari iceren bir koleksiyonu temsil eder. Yani, ayni eleman kumesinde yalnizca bir kez bulunabilir. `Set` arabirimi, elemanlarin sirasini garanti etmez.

Set interface’in alt s?n?flar?:

HashSet

LinkedHashSet

TreeSet


`Set` arabirimine ait temel metotlar sunlardir:

- `add(E element)`: Belirtilen ogeyi kumeye ekler.
- `remove(Object o)`: Belirtilen ogeyi kumeden kaldirir.
- `contains(Object o)`: Belirtilen ogenin kumede olup olmadigini kontrol eder.
- `size()`: Kumenin eleman sayisini dondurur.
- `isEmpty()`: Kumenin bos olup olmadigini kontrol eder.

Java'da yaygin olarak kullanilan `Set` arabirimine ait implementasyonlardan biri `HashSet` sinifidir.

## 2. HashSet Sinifi Nedir?

`HashSet`, `Set` arabirimini uygulayan ve elemanlari benzersiz tutan bir siniftir. Bu sinif, bir tablo (hash table) kullanarak elemanlari depolar ve bu sayede hizli bir erisim saglar. Elemanlarin sirasini garanti etmez, yani eklenen sirayla elemanlar sirali degildir.

### 2.1 HashSet Olusturma

```java
Set<String> hashSet = new HashSet<>();
```

Yukaridaki kod, `HashSet` sinifindan bir ornek olusturur. Elemanlar bu kume icinde benzersiz olacak sekilde eklenir.

### 2.2 HashSet Ornek Kullanim

```java
Set<String> hashSet = new HashSet<>();

hashSet.add("Java");
hashSet.add("Python");
hashSet.add("C++");
hashSet.add("Java"); // Bu eleman kume icinde zaten bulundugu icin eklenmez.

System.out.println("HashSet: " + hashSet);
```

Yukaridaki ornekte, "Java" elemani kume icinde zaten bulundugu icin tekrar eklenmez. `System.out.println` ifadesiyle kumenin icerigi ekrana yazdirilir.

### 2.3 HashSet Iterasyon

```java
Set<String> hashSet = new HashSet<>();

hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Orange");

for (String fruit : hashSet) {
    System.out.println(fruit);
}
/*
Iterator<String> iterator = hashSet.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}*/

```


