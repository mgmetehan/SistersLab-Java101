package src.ders.ders9and10.akis004;

public class Kutu<T> {
    private T icerik;

    public void print(T icerik){
        System.out.println(icerik);
    }

    public T getIcerik() {
        return icerik;
    }

    public void setIcerik(T icerik) {
        this.icerik = icerik;
    }
}
