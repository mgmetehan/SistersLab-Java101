`switch-case` ifadesi, belirli bir degerin birden cok duruma gore kontrol edilmesini ve farkli durumlar icin farkli kod bloklarinin calistirilmasini saglayan bir kontrol yapisidir. Java'daki `switch-case` ifadesinin genel syntax'i su sekildedir:

```java
switch (deger) {
    case durum1:
        // durum1 icin calisacak kod blogu
        break;
    case durum2:
        // durum2 icin calisacak kod blogu
        break;
    // ...
    default:
        // hicbir durum eslesmezse calisacak kod blogu
}
```

- `deger`: Deger, kontrol edilmek istenen ifadenin veya degiskenin kendisidir.
- `case durum1:`: Bu durum, `switch` ifadesinin degeri `durum1` ile eslesirse calisacak kod blogunu belirtir. `break;` ifadesi, eslesen durumu bulduktan sonra `switch-case` blogunu terk eder.
- `default:`: Bu blok, hicbir `case` eslesmezse calisacak olan varsayilan durumu belirtir. `default` blogu istege baglidir, kullanilmayabilir.

Iste bir ornek:

```java
public class SwitchCaseOrnegi {
    public static void main(String[] args) {
        int gun = 3;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun");
        }
    }
}
```

public class MevsimSwitchCase {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Bir mevsim numarasi girin (1-4): ");
        int mevsimNumarasi = scanner.nextInt();

        String mevsimAdi;

        switch (mevsimNumarasi) {
            case 1:
                mevsimAdi = "Ilkbahar";
                System.out.println("Mart, Nisan, Mayis aylarina denk gelir.");
                break;
            case 2:
                mevsimAdi = "Yaz";
                System.out.println("Haziran, Temmuz, Agustos aylarina denk gelir.");
                break;
            case 3:
                mevsimAdi = "Sonbahar";
                System.out.println("Eylul, Ekim, Kasim aylarina denk gelir.");
                break;
            case 4:
                mevsimAdi = "Kis";
                System.out.println("Aralik, Ocak, Subat aylarina denk gelir.");
                break;
            default:
                mevsimAdi = "Gecersiz mevsim numarasi";
        }

        System.out.println("Girilen mevsim numarasina karsilik gelen mevsim: " + mevsimAdi);
    }
}