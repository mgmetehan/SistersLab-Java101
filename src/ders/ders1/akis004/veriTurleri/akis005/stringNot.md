**String Veri Tipi:**

- `String` veri tipi, metinsel verileri temsil etmek i?in kullan?l?r ve Java'da bir s?n?ft?r.
- Bir metin veya karakter dizisi, ?ift t?rnak i?inde tan?mlanarak bir `String` de?i?kenine atan?r.
  ```java
  String isim = "John";
  ```

- `String` veri tipi, de?i?tirilemez (immutable) ?zelli?e sahiptir. Yani, bir kez olu?turulduktan sonra ?zerinde do?rudan de?i?iklik yap?lamaz. Ancak, yeni bir `String` nesnesi olu?turarak de?i?iklikler yap?labilir.

- `String` s?n?f?, metin i?leme i?levselli?i sa?layan bir dizi metod i?erir. Bu metodlar arac?l???yla metin birle?tirme, alt dizilere eri?im, b?y?kl?k k???kl?k kar??la?t?rmalar? gibi bir?ok metinsel i?lem ger?ekle?tirilebilir.

?rnek kullan?m:
```java
String mesaj = "Merhaba, ";
String kisi = "Ahmet";
String tamMesaj = mesaj + kisi; // "Merhaba, Ahmet"
```

`String` veri tipi, Java'daki metinsel operasyonlar ve metinle ilgili i?lemlerde yayg?n olarak kullan?l?r.