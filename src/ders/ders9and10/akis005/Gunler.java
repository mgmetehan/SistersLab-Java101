package src.ders.ders9and10.akis005;

public enum Gunler {
/*    PAZARTESI(1), SALI(2), CARSAMBA(3), PERSEMBE(4), CUMA(5), CMT(6), PAZAR(7);

    private final int gunKodu;

    Gunler(int gunKodu) {
        this.gunKodu = gunKodu;
    }

    public int getGunKodu() {
        return gunKodu;
    }*/
PAZARTESI("selam"),
    SALI("merhba"),
    CARSAMBA("hi"),
    PERSEMBE("hello"),
    CUMA("naber"),
    CMT("i"),
    PAZAR("?");

    private final String gunKodu;

    Gunler(String gunKodu) {
        this.gunKodu = gunKodu;
    }

    public String getGunKodu() {
        return gunKodu;
    }
}
