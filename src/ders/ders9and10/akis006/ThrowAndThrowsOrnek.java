package src.ders.ders9and10.akis006;

public class ThrowAndThrowsOrnek {

    public static void chechNumber(int number) throws MyException {
        if (number < 0) {
            throw new MyException("Negatif sayi girdiniz programi kirdiniz!!!!" + number);
        }
    }

    public static void main(String[] args) throws MyException {
        try {
            chechNumber(10);
            chechNumber(-1);
        } catch (MyException e) {
            //System.out.println("Hata yakalandi !!"+ e.getMessage());
            //throw new MyException("NEden bana bunu yaptin!!");
            throw new RuntimeException("Hayir!");
        }
    }

/*    public static void main(String[] args) throws MyException {
            chechNumber(-1);
    }*/
}
