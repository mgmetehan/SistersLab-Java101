ondalikli sayilar

1. **float Veri Tipi:**
   Java'da float, ondal?k say?lar? temsil etmek i?in kullan?lan 32 bitlik bir veri tipidir. ?rne?in:
   ```java
   float sayi = 3.14f;
   ```

2. **double Veri Tipi:**
   double, 64 bitlik bir veri tipidir ve daha geni? bir say? aral???na ve daha y?ksek hassasiyete sahiptir. ?rne?in:
   ```java
   double buyukSayi = 123456.789;
   ```

Float ve double veri tipleri aras?ndaki temel fark, kullan?lan bellek boyutu ve dolay?s?yla da say?lar?n temsil edildi?i hassasiyetle ilgilidir.

1. **Bellek Boyutu:**
    - `float`: 32 bit bellek kullan?r.
    - `double`: 64 bit bellek kullan?r.

2. **Hassasiyet:**
    - `float`: Daha d???k hassasiyete sahiptir. Bu nedenle ondal?k say?larla yap?lan hesaplamalarda daha fazla yuvarlama hatas? olabilir.
    - `double`: Daha y?ksek hassasiyete sahiptir. Bu, daha geni? bir say? aral???n? ve daha hassas ondal?k say? temsilini m?mk?n k?lar.

3. **Kullan?m Alanlar?:**
    - `float`: Bellek tasarrufu ?nemliyse ve daha d???k hassasiyet kabul edilebilirse kullan?labilir.
    - `double`: Daha geni? say? aral?klar? veya y?ksek hassasiyet gerektiren uygulamalarda tercih edilir.

?rne?in, finansal hesaplamalarda genellikle `double` tercih edilir ??nk? finansal de?erlerde y?ksek hassasiyet gereklidir. Ancak, bellek kullan?m? kritik bir fakt?rse ve daha d???k hassasiyet kabul edilebiliyorsa, `float` kullan?labilir.   