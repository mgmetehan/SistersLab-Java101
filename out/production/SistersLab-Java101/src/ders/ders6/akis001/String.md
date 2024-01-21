# Java'da String Sinifi ve Metotlari

Java'da `String` sinifi, metin verilerini temsil etmek ve metin uzerinde cesitli islemleri gerceklestirmek icin kullanilir. `String` sinifi, Java'nin temel siniflarindan biridir ve bir dizi metot icerir. Iste `String` sinifinin bazi onemli metotlari ve aciklamalari:

## `length()`
- **Aciklama:** Bu metot, bir String'in karakter sayisini dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  int uzunluk = str.length();
  System.out.println("String Uzunlugu: " + uzunluk);
  ```

## `charAt(int index)`
- **Aciklama:** Belirtilen indeksteki karakteri dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba";
  char karakter = str.charAt(2);
  System.out.println("2. indeksteki karakter: " + karakter);
  ```

## `concat(String str)`
- **Aciklama:** Mevcut String'i baska bir String ile birlestirir.
- **Ornek:**
  ```java
  String str1 = "Merhaba";
  String str2 = "Dunya";
  String birlesik = str1.concat(str2);
  System.out.println("Birlestirilmis String: " + birlesik);
  ```

## `equals(Object anObject)`
- **Aciklama:** Iki String'in esit olup olmadigini kontrol eder.
- **Ornek:**
  ```java
  String str1 = "Merhaba";
  String str2 = "Merhaba";
  boolean esitMi = str1.equals(str2);
  System.out.println("Esitlik Kontrolu: " + esitMi);
  ```

## `equalsIgnoreCase(String anotherString)`
- **Aciklama:** Iki String'i buyuk-kucuk harf duyarsiz olarak kontrol eder.
- **Ornek:**
  ```java
  String str1 = "Merhaba";
  String str2 = "merhaba";
  boolean esitMi = str1.equalsIgnoreCase(str2);
  System.out.println("Esitlik Kontrolu (Buyuk-Kucuk Harf Duyarsiz): " + esitMi);
  ```

## `indexOf(String str)`
- **Aciklama:** Belirtilen alt String'in ilk indeksini dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  int indeks = str.indexOf("Dunya");
  System.out.println("Alt String'in Ilk Indeksi: " + indeks);
  ```

## `substring(int beginIndex)`
- **Aciklama:** Belirtilen indeksten baslayarak String'in bir alt dizisini dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  String altString = str.substring(8);
  System.out.println("Alt String: " + altString);
  ```

## `substring(int beginIndex, int endIndex)`
- **Aciklama:** Belirtilen indeksten baslayarak belirtilen indekse kadar olan bir alt String'i dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  String altString = str.substring(8, 14);
  System.out.println("Alt String: " + altString);
  ```

## `toLowerCase()`
- **Aciklama:** String'i kucuk harfe donusturur.
- **Ornek:**
  ```java
  String str = "MERHABA";
  String kucukHarf = str.toLowerCase();
  System.out.println("Kucuk Harfe Donusturulmus String: " + kucukHarf);
  ```

## `toUpperCase()`
- **Aciklama:** String'i buyuk harfe donusturur.
- **Ornek:**
  ```java
  String str = "merhaba";
  String buyukHarf = str.toUpperCase();
  System.out.println("Buyuk Harfe Donusturulmus String: " + buyukHarf);
  ```

## `trim()`
- **Aciklama:** String'in basindaki ve sonundaki bosluklari temizler.
- **Ornek:**
  ```java
  String str = "  Merhaba, Dunya!  ";
  String temizString = str.trim();
  System.out.println("Temizlenmis String: " + temizString);
  ```

## `replace(char oldChar, char newChar)`
- **Aciklama:** Belirtilen eski karakteri yeni karakterle degistirir.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  String yeniString = str.replace('a', 'o');
  System.out.println("Degistirilmis String: " + yeniString);
  ```

Tabii ki, iste `String` sinifinin daha fazla metodu ve aciklamalari:

## `startsWith(String prefix)`
- **Aciklama:** String, belirtilen bir onek ile basliyorsa `true`, aksi halde `false` dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  boolean basladiMi = str.startsWith("Mer");
  System.out.println("Onceki onek ile basliyor mu: " + basladiMi);
  ```

## `endsWith(String suffix)`
- **Aciklama:** String, belirtilen bir sonek ile bitiyorsa `true`, aksi halde `false` dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  boolean bittiMi = str.endsWith("nya!");
  System.out.println("Sonraki sonek ile bitiyor mu: " + bittiMi);
  ```

## `contains(CharSequence sequence)`
- **Aciklama:** Belirtilen karakter dizisini iceriyorsa `true`, aksi halde `false` dondurur.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  boolean iceriyorMu = str.contains("Dunya");
  System.out.println("Belirli bir karakter dizisini iceriyor mu: " + iceriyorMu);
  ```

## `isEmpty()`
- **Aciklama:** String bos ise `true`, aksi halde `false` dondurur.
- **Ornek:**
  ```java
  String str1 = "";
  String str2 = "Merhaba";
  System.out.println("str1 bos mu: " + str1.isEmpty());
  System.out.println("str2 bos mu: " + str2.isEmpty());
  ```

## `replace(CharSequence target, CharSequence replacement)`
- **Aciklama:** Belirtilen hedef karakter dizisini belirtilen yeni karakter dizisi ile degistirir.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  String yeniString = str.replace("Dunya", "Java");
  System.out.println("Degistirilmis String: " + yeniString);
  ```

## `replaceAll(String regex, String replacement)`
- **Aciklama:** Belirtilen duzenli ifadeyi karsilayan tum alt dizinleri belirtilen yeni karakter dizisi ile degistirir.
- **Ornek:**
  ```java
  String str = "Merhaba, Dunya!";
  String yeniString = str.replaceAll("\\s", "");
  System.out.println("Bosluklari Kaldirilmis String: " + yeniString);
  ```

## `toLowerCase(Locale locale)` ve `toUpperCase(Locale locale)`
- **Aciklama:** Belirtilen bir yerel ayara gore String'i kucuk veya buyuk harfe donusturur.
- **Ornek:**
  ```java
  String str = "MERHABA";
  String kucukHarf = str.toLowerCase(Locale.ENGLISH);
  String buyukHarf = str.toUpperCase(Locale.ENGLISH);
  System.out.println("Kucuk Harfe Donusturulmus String: " + kucukHarf);
  System.out.println("Buyuk Harfe Donusturulmus String: " + buyukHarf);
  ```

## `compareTo(String anotherString)`
- **Aciklama:** Iki String'i karsilastirir. Eger String'ler esitse 0, bu String daha kucukse negatif bir deger, daha buyukse pozitif bir deger dondurur.
- **Ornek:**
  ```java
  String str1 = "Merhaba";
  String str2 = "Dunya";
  int karsilastirma = str1.compareTo(str2);
  System.out.println("Karakter dizilerinin karsilastirma sonucu: " + karsilastirma);
  ```

## `equalsIgnoreCase(String anotherString)`
- **Aciklama:** Iki String'i buyuk-kucuk harf duyarsiz olarak karsilastirir. Eger String'ler esitse 0, bu String daha kucukse negatif bir deger, daha buyukse pozitif bir deger dondurur.
- **Ornek:**
  ```java
  String str1 = "Merhaba";
  String str2 = "merhaba";
  int karsilastirma = str1.compareToIgnoreCase(str2);
  System.out.println("Buyuk-Kucuk Harf Duyarsiz Karsilastirma: " + karsilastirma);
  ```
