Kod Bloklari (Scope) Nedir?

Kod bloklari (scope), bir program icinde belirli bir degiskenin gorulebilir oldugu veya kullanilabilir oldugu alanlari ifade eder. Yani, bir degiskenin tanimlandigi yer ve bu degiskenin kullanilabilecegi alanlar, o degiskenin kapsamini belirler.

Java'da, kapsam genellikle suslu parantezler {} arasindaki alanlari ifade eder. Her suslu parantez cifti bir kod blogunu temsil eder.

Kotu Kod Bloku Ornegi:
```java
public class ScopeOrnegi {
public static void main(String[] args) {
int sayi = 5;
if (sayi > 0) {int yeniSayi = sayi * 2;}
System.out.println(yeniSayi); // Hata! 'yeniSayi' kapsam disinda
}}
```

Iyi Kod BlokuOrnegi:

```java
public class ScopeOrnegi {
    public static void main(String[] args) {
        int sayi = 5;
        if (sayi > 0) {
            int yeniSayi = sayi * 2;
            System.out.println(yeniSayi);
        }
    }
}
```
