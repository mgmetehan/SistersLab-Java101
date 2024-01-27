# Getter ve Setter Metotlari

Java'da getter ve setter metotlari, bir sinifin private (ozel) degiskenlerine erisim ve bu degiskenleri guncelleme amaciyla kullanilan yontemlerdir. Bu metotlar, sinifin icindeki private degiskenlere disaridan erisim saglar ve bu degiskenlere guvenli bir sekilde deger atama veya deger alma imkani tanir.

## Getter Metodu

Getter metodu, bir sinifin private bir ozelligine erismek icin kullanilir. Bu metot, genellikle ozelligin degerini donduren bir metottur ve genellikle `getPropertyName` seklinde adlandirilir.

```java
public class Ogrenci {
    private String ad;

    // Getter metodu
    public String getAd() {
        return ad;
    }
}
```

Yukaridaki ornekte, `Ogrenci` sinifinin `ad` ozelligine erismek icin `getAd` isimli bir getter metodu tanimlanmistir.

## Setter Metodu

Setter metodu, bir sinifin private bir ozelligine deger atamak icin kullanilir. Bu metot, genellikle ozellige yeni bir deger atayan bir metottur ve genellikle `setPropertyName` seklinde adlandirilir.

```java
public class Ogrenci {
    private String ad;

    // Setter metodu
    public void setAd(String yeniAd) {
        this.ad = yeniAd;
    }
}
```

Yukaridaki ornekte, `Ogrenci` sinifinin `ad` ozelligine deger atamak icin `setAd` isimli bir setter metodu tanimlanmistir.

## Kullanimi

Getter ve setter metotlari, sinifin private ozelliklerine guvenli bir sekilde erisim saglar. Bu metotlar sayesinde sinifin disinda, sadece belirlenen yollarla ve kontrol altinda erisim saglanabilir.

```java
public class OgrenciProgrami {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        
        // Setter kullanimi
        ogrenci.setAd("Ahmet");
        
        // Getter kullanimi
        String ad = ogrenci.getAd();
        
        System.out.println("Ogrenci adi: " + ad);
    }
}
```

Yukaridaki ornekte, `Ogrenci` sinifinin ornegi olan `ogrenci` uzerinden setter metodu ile ad atamasi yapilirken, getter metodu ile bu deger alinmis ve ekrana yazdirilmistir.

Getter ve setter metotlari, siniflarin encapsulation (kapsulleme) ilkesine uygun bir sekilde tasarlanmasina yardimci olur. Bu ilke, sinif icindeki detaylarin disari sizmasini onleyerek daha guvenli ve kontrol edilebilir bir kod yapisi saglar.