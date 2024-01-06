ondalikli sayilar

1. **float Veri Tipi:**
   Java'da float, ondalik sayilari temsil etmek icin kullanilan 32 bitlik bir veri tipidir. Ornegin:
   ```java
   float sayi = 3.14f;
   ```

2. **double Veri Tipi:**
   double, 64 bitlik bir veri tipidir ve daha genis bir sayi araligina ve daha yuksek hassasiyete sahiptir. Ornegin:
   ```java
   double buyukSayi = 123456.789;
   ```

Float ve double veri tipleri arasindaki temel fark, kullanilan bellek boyutu ve dolayisiyla da sayilarin temsil edildigi hassasiyetle ilgilidir.

1. **Bellek Boyutu:**
   - `float`: 32 bit bellek kullanir.
   - `double`: 64 bit bellek kullanir.

2. **Hassasiyet:**
   - `float`: Daha dusuk hassasiyete sahiptir. Bu nedenle ondalik sayilarla yapilan hesaplamalarda daha fazla yuvarlama hatasi olabilir.
   - `double`: Daha yuksek hassasiyete sahiptir. Bu, daha genis bir sayi araligini ve daha hassas ondalik sayi temsilini mumkun kilar.

3. **Kullanim Alanlari:**
   - `float`: Bellek tasarrufu onemliyse ve daha dusuk hassasiyet kabul edilebilirse kullanilabilir.
   - `double`: Daha genis sayi araliklari veya yuksek hassasiyet gerektiren uygulamalarda tercih edilir.

Ornegin, finansal hesaplamalarda genellikle `double` tercih edilir cunku finansal degerlerde yuksek hassasiyet gereklidir. Ancak, bellek kullanimi kritik bir faktorse ve daha dusuk hassasiyet kabul edilebiliyorsa, `float` kullanilabilir.   