
# Java 101 Bootcamp - Static Nedir?

## 1. Static Nedir?

"Static", Java'da bir seyin sadece bir kez var oldugunu ve herkesle paylasildigini belirtmek icin kullanilir. Yani, bir seyin "static" olmasi demek, o seyin sadece bir tane oldugu ve herkesin ona ayni sekilde erisebilecegi anlamina gelir.

## 2. Static Alanlar

Java'da bir sinifin icindeki bir ozellige "alan" denir. Eger bir alani "static" olarak tanimlarsak, o alan sadece bir tane olur ve sinifin diger ornekleri arasinda paylasilir.

```java
public class StaticExample {
    // Static alan
    public static int sayac = 0;
    
    // Normal alan
    public int numara;
}
```

Bu ornekte, `sayac` adli alani sadece bir tane olacak ve herkes bu sayaci kullanabilecek.

## 3. Static Metodlar

Metodlar da bir seyi yapmak icin kullanilir. Eger bir metod "static" olarak tanimlanirsa, o metod sinifin bir ornegi olusturulmadan dogrudan sinif adiyla cagrilabilir.

```java
public class StaticExample {
    // Static metod
    public static void selamla() {
        System.out.println("Merhaba! Ben bir static metodum.");
    }
    
    // Normal metod
    public void beniCagir() {
        System.out.println("Ben bir ornek metoddum.");
    }
}
```

Burada, `selamla()` metodu sinif adi uzerinden dogrudan cagrilabilir.

## 4. Neden Kullanmaliyiz?

Static kullanmanin en guzel yani, bilgiyi paylasma ve gereksiz nesne olusturmamaktir. Mesela, bir sayaci static olarak tanimlayarak, o sayaci kullanan tum orneklerin ayni sayaci paylasmasini saglayabiliriz.

```java
StaticExample.sayac++;
```

Bu sayede her ornek sayaci kullanirken, aslinda ayni sayaci artirip paylasiyor.
