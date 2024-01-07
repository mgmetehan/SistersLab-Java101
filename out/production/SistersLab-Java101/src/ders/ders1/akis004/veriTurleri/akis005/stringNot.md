**String Veri Tipi:**

- `String` veri tipi, metinsel verileri temsil etmek icin kullanilir ve Java'da bir siniftir.
- Bir metin veya karakter dizisi, cift tirnak icinde tanimlanarak bir `String` degiskenine atanir.
  ```java
  String isim = "John";
  ```

- `String` veri tipi, degistirilemez (immutable) ozellige sahiptir. Yani, bir kez olusturulduktan sonra uzerinde dogrudan degisiklik yapilamaz. Ancak, yeni bir `String` nesnesi olusturarak degisiklikler yapilabilir.

- `String` sinifi, metin isleme islevselligi saglayan bir dizi metod icerir. Bu metodlar araciligiyla metin birlestirme, alt dizilere erisim, buyukluk kucukluk karsilastirmalari gibi bircok metinsel islem gerceklestirilebilir.

Ornek kullanim:
```java
String mesaj = "Merhaba, ";
String kisi = "Ahmet";
String tamMesaj = mesaj + kisi; // "Merhaba, Ahmet"
```

`String` veri tipi, Java'daki metinsel operasyonlar ve metinle ilgili islemlerde yaygin olarak kullanilir.