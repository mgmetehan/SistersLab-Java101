Kosul operatoru "ternary operator"
Bu operator, bir kosulu degerlendirir ve kosulun dogru (`true`) veya yanlis (`false`) olmasina bagli olarak iki farkli ifadeyi dondurur. Java'da kosul operatoru su sekildedir:

```java
(kosul) ? ifade1 : ifade2
```

- Eger `kosul` dogru ise, operator `ifade1` degerini dondurur.
- Eger `kosul` yanlis ise, operator `ifade2` degerini dondurur.

Ornek:

```java
int sayi = 5;
String sonuc = (sayi > 0) ? "Pozitif" : "Negatif veya Sifir";
System.out.println(sonuc); // "Pozitif"
```

Bu ornekte, `sayi` degiskeninin degeri 0'dan buyuk oldugu icin `(sayi > 0)` ifadesi dogru olur. Dolayisiyla, "Pozitif" degeri `sonuc` degiskenine atanir ve ekrana yazdirilir.

Kosul operatoru, basit sartli ifadeleri kisa bir sekilde ifade etmek icin kullanilir. Ancak, karmasik kosullar icin genellikle `if-else` ifadeleri tercih edilir.