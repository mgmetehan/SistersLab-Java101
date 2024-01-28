# Java Method Overriding (Metod Ezme)

## Giris

Java'da, bir alt sinifta ust siniftan miras alinan bir metodun, alt sinifta farkli bir sekilde implemente edilmesine "Method Overriding" veya "Metod Ezme" denir. Bu, alt sinifin ust sinifin ayni adli metodunu kullanici tarafindan belirlenen ozel bir islevsellikle degistirmesine olanak tanir.

### Temel Kurallar

1. **Isim ve Parametreler:**
    - Ezilen metodun adi, ezilen metodun adiyla ayni olmalidir.
    - Parametre listesi, ezilen metodun parametre listesiyle ayni olmalidir.

2. **Donus Turu:**
    - Donus turu (return type), ezilen metodun donus turuyle ayni olmalidir. Ancak, Java 5 ve sonrasinda covariant return types ozelligi ile ezilen metodun donus turu, ezilen metodun donus turuyle uyumlu alt tur olabilir.

3. **Erisim Belirleyicileri:**
    - Ezilen metodun erisim belirleyicisi, ezilen metodun erisim belirleyicisiyle ayni veya genisletici olmalidir. Ornegin, ezilen metodun erisim belirleyicisi `protected` ise, ezilen metodun erisim belirleyicisi `protected` veya `public` olabilir, ancak `private` olamaz.

4. **Exception (Istisna) Tipi:**
    - Ezilen metodun throws bildirimi, ezilen metodun throws bildirimini genisletebilir. Ancak, ezilen metodun throws bildirimi, ezilen metodun throws bildirimini daraltamaz veya yeni istisna turleri ekleyemez.

## Ornek

```java
class GeometrikSekil {
    void ciz() {
        System.out.println("Genel geometrik sekli ciz");
    }
}

class Dikdortgen extends GeometrikSekil {
    @Override
    void ciz() {
        System.out.println("Dikdortgen ciz");
    }
}

public class Main {
    public static void main(String[] args) {
        GeometrikSekil sekil = new Dikdortgen();
        sekil.ciz(); // Dikdortgen ciz
    }
}
```
