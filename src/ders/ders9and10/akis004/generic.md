# Java Generics (Jenerikler)

## Giris

Java Generics (Jenerikler), Java programlama dilinde, veri tiplerinden bagimsiz ve tip guvenligi saglayan bir programlama konseptidir. Bu ozellik, ayni kodun farkli veri tipleriyle calisabilmesini ve tip hatalarini compile-time (derleme zamani) asamasinda belirlenmesini saglar.

## Temel Kavramlar

### 1. Jenerik Siniflar (Generic Classes)

Jenerik siniflar, bir veya daha fazla tur parametresi alabilen siniflardir. Bu parametreler, sinifin icinde ve disinda kullanilabilir.

```java
public class Kutu<T> {
    private T icerik;

    public T getIcerik() {
        return icerik;
    }

    public void setIcerik(T icerik) {
        this.icerik = icerik;
    }
}
```

Yukaridaki ornekte `Kutu` sinifi, bir tur parametresi (`T`) alan basit bir jenerik sinifi temsil etmektedir.

### 2. Jenerik Metotlar (Generic Methods)

Jenerik metotlar, tur parametreleri iceren metotlardir. Bu metotlar, sadece belirli bir turle calismak zorunda degildir.

```java
public <T> T toplama(T sayi1, T sayi2) {
    return sayi1 + sayi2;
}
```

Yukaridaki ornekte `toplama` adli jenerik bir metot bulunmaktadir.

### 3. Jenerik Arabirimler (Generic Interfaces)

Jenerik arabirimler, bir veya daha fazla tur parametresi iceren arabirimlerdir.

```java
public interface Cift<T, U> {
    void ekle(T deger1, U deger2);
    T getDeger1();
    U getDeger2();
}
```

Yukaridaki ornekte `Cift` adli bir jenerik arabirim tanimlanmistir.

## Kullanim Ornekleri

### 1. Jenerik Sinif Kullanimi

```java
Kutu<Integer> integerKutu = new Kutu<>();
integerKutu.setIcerik(42);
System.out.println("Kutu Icerigi: " + integerKutu.getIcerik());

Kutu<String> stringKutu = new Kutu<>();
stringKutu.setIcerik("Merhaba, Jenerikler!");
System.out.println("Kutu Icerigi: " + stringKutu.getIcerik());
```

### 2. Jenerik Metot Kullanimi

```java
Integer toplamInt = toplama(5, 10);
System.out.println("Toplam (Integer): " + toplamInt);

Double toplamDouble = toplama(3.14, 2.5);
System.out.println("Toplam (Double): " + toplamDouble);
```

### 3. Jenerik Arabirim Kullanimi

```java
public class CiftUygulama implements Cift<String, Integer> {
    private String deger1;
    private Integer deger2;

    @Override
    public void ekle(String deger1, Integer deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;
    }

    @Override
    public String getDeger1() {
        return deger1;
    }

    @Override
    public Integer getDeger2() {
        return deger2;
    }
}
```

Bu ornekler, Java Generics'in temel kavramlarini anlamaniza yardimci olmalidir. Generics, kodunuzun daha esnek, okunabilir ve tip guvenli olmasina katki saglar.

