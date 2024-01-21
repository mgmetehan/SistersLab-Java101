## `java.util.Arrays` Sinifi ve Metotlari

`java.util.Arrays` sinifi, Java'da dizilerle ilgili bir dizi islevi saglamak amaciyla kullanilir. Bu sinif, diziler uzerinde genis bir yelpazede islemleri gerceklestirmek icin bir dizi statik metot icerir. Asagida, `Arrays` sinifinin onemli metotlari ve ne ise yaradiklari aciklanmaktadir:

### 1. `sort` Metodu

**Islevi:**
Diziyi kucukten buyuge siralar.

**Kullanim:**
```java
int[] dizi = {5, 2, 8, 1, 7};
Arrays.sort(dizi);
```

### 2. `toString` Metodu

**Islevi:**
Diziyi bir dize olarak temsil eden bir metin olusturur.

**Kullanim:**
```java
int[] dizi = {1, 2, 3, 4, 5};
String diziString = Arrays.toString(dizi);
```

### 3. `equals` Metodu

**Islevi:**
Iki dizinin esit olup olmadigini kontrol eder.

**Kullanim:**
```java
int[] dizi1 = {1, 2, 3};
int[] dizi2 = {1, 2, 3};
boolean esitMi = Arrays.equals(dizi1, dizi2);
```

### 4. `fill` Metodu

**Islevi:**
Dizinin tum elemanlarini belirtilen bir degerle doldurur.

`fill` Metodu:

```java
public static void fill(T[] a, T val);
```

```java
public static void fill(T[] a, int fromIndex, int toIndex, T val);
```

**Parametreler:**
- `a`: Degerlerle doldurulacak diziyi temsil eden dizi.
- `val`: Diziyi doldurmak icin kullanilacak deger.
- `fromIndex` ve `toIndex` (sadece ikinci versiyon): Doldurmanin baslayacagi ve bitecegi indeksler.

**Aciklama:**
- `fill` metodu, belirtilen diziyi belirtilen degerle doldurur.
- Ikinci versiyon, `fromIndex` ve `toIndex` parametreleri arasindaki indeks araligini belirleyerek belirli bir bolgeyi doldurmaniza olanak tanir.
- Doldurulan deger, `val` parametresi tarafindan saglanir.

**Kullanim:**
```java
int[] dizi = new int[5];
Arrays.fill(dizi, 42);
```

### 5. `binarySearch` Metodu
/2 ile arama yapar.

**Islevi:**
Sirali bir dizide belirli bir elemanin indeksini bulur.

**Kullanim:**
```java
int[] dizi = {1, 2, 5, 7, 8};
int indeks = Arrays.binarySearch(dizi, 5);
```

### 6. `copyOf` ve `copyOfRange` Metotlari

**Islevi:**
Dizinin belirli bir uzunluguna kadar olan bir kopyasini olusturur veya belirli bir araligi kopyalar.

`copyOfRange` Metodu:

```java
public static T[] copyOfRange(T[] original, int from, int to)
```

**Parametreler:**
- `original`: Kopyalanacak diziyi temsil eden orijinal dizi.
- `from`: Kopyalamanin baslayacagi indeks (dahil).
- `to`: Kopyalamanin bitecegi indeks (haric).

**Aciklama:**
- `copyOfRange` metodu, `original` dizisinin belirtilen araligindan (`from` ile `to` arasindaki elemanlar) yeni bir dizi olusturur ve bu kopyayi dondurur.
- Olusturulan kopya, `original` dizisinin belirtilen araligina sahip olur.

**Kullanim:**
```java
int[] kaynakDizi = {1, 2, 3, 4, 5};
int[] kopyaDizi1 = Arrays.copyOf(kaynakDizi, 3);
int[] kopyaDizi2 = Arrays.copyOfRange(kaynakDizi, 1, 4);
```

### 7. `fill` Metodu ile Belirli Araligi Doldurma

**Islevi:**
Belirli bir araligi belirli bir degerle doldurur.

**Kullanim:**
```java
int[] dizi = {1, 2, 3, 4, 5};
Arrays.fill(dizi, 1, 4, 10);
```

### 8. `asList` Metodu

**Islevi:**
Varargs kullanarak bir dizi veya dizi elemanlarini bir liste olarak dondurur.

**Kullanim:**
```java
String[] kelimeler = {"Java", "Python", "C++"};
List<String> liste = Arrays.asList(kelimeler);
```
